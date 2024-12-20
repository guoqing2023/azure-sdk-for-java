// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file.datalake.specialized;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.http.HttpPipeline;
import com.azure.storage.blob.BlobContainerClientBuilder;
import com.azure.storage.blob.specialized.BlobLeaseClientBuilder;
import com.azure.storage.blob.specialized.SpecializedBlobClientBuilder;
import com.azure.storage.file.datalake.DataLakeDirectoryAsyncClient;
import com.azure.storage.file.datalake.DataLakeDirectoryClient;
import com.azure.storage.file.datalake.DataLakeFileAsyncClient;
import com.azure.storage.file.datalake.DataLakeFileClient;
import com.azure.storage.file.datalake.DataLakeFileSystemAsyncClient;
import com.azure.storage.file.datalake.DataLakeFileSystemClient;
import com.azure.storage.file.datalake.DataLakeServiceVersion;
import com.azure.storage.file.datalake.implementation.util.DataLakeImplUtils;
import com.azure.storage.file.datalake.implementation.util.TransformUtils;

import java.net.URL;
import java.util.Objects;
import java.util.UUID;

/**
 * This class provides a fluent builder API to help aid the configuration and instantiation of Storage Lease
 * clients. Lease clients are able to interact with both file system and path clients and act as a supplement client. A
 * new instance of {@link DataLakeLeaseClient} and {@link DataLakeLeaseAsyncClient} are constructed every time
 * {@link #buildClient() buildClient} and {@link #buildAsyncClient() buildAsyncClient} are called
 * respectively.
 *
 * <p>When a client is instantiated and a {@link #leaseId(String) leaseId} hasn't been set a {@link UUID} will be used
 * as the lease identifier.</p>
 *
 * <p><strong>Instantiating LeaseClients</strong></p>
 *
 * <!-- src_embed com.azure.storage.file.datalake.specialized.DataLakeLeaseClientBuilder.syncInstantiationWithFileAndLeaseId -->
 * <pre>
 * DataLakeLeaseClient dataLakeLeaseClient = new DataLakeLeaseClientBuilder&#40;&#41;
 *     .fileClient&#40;fileClient&#41;
 *     .leaseId&#40;leaseId&#41;
 *     .buildClient&#40;&#41;;
 * </pre>
 * <!-- end com.azure.storage.file.datalake.specialized.DataLakeLeaseClientBuilder.syncInstantiationWithFileAndLeaseId -->
 *
 * <!-- src_embed com.azure.storage.file.datalake.specialized.DataLakeLeaseClientBuilder.syncInstantiationWithDirectoryAndLeaseId -->
 * <pre>
 * DataLakeLeaseClient dataLakeLeaseClient = new DataLakeLeaseClientBuilder&#40;&#41;
 *     .directoryClient&#40;directoryClient&#41;
 *     .leaseId&#40;leaseId&#41;
 *     .buildClient&#40;&#41;;
 * </pre>
 * <!-- end com.azure.storage.file.datalake.specialized.DataLakeLeaseClientBuilder.syncInstantiationWithDirectoryAndLeaseId -->
 *
 * <!-- src_embed com.azure.storage.file.datalake.specialized.DataLakeLeaseClientBuilder.syncInstantiationWithFileSystemAndLeaseId -->
 * <pre>
 * DataLakeLeaseClient dataLakeLeaseClient = new DataLakeLeaseClientBuilder&#40;&#41;
 *     .fileSystemClient&#40;dataLakeFileSystemClient&#41;
 *     .leaseId&#40;leaseId&#41;
 *     .buildClient&#40;&#41;;
 * </pre>
 * <!-- end com.azure.storage.file.datalake.specialized.DataLakeLeaseClientBuilder.syncInstantiationWithFileSystemAndLeaseId -->
 *
 * <p><strong>Instantiating LeaseAsyncClients</strong></p>
 *
 * <!-- src_embed com.azure.storage.file.datalake.specialized.DataLakeLeaseClientBuilder.asyncInstantiationWithFileAndLeaseId -->
 * <pre>
 * DataLakeLeaseAsyncClient dataLakeLeaseAsyncClient = new DataLakeLeaseClientBuilder&#40;&#41;
 *     .fileAsyncClient&#40;fileAsyncClient&#41;
 *     .leaseId&#40;leaseId&#41;
 *     .buildAsyncClient&#40;&#41;;
 * </pre>
 * <!-- end com.azure.storage.file.datalake.specialized.DataLakeLeaseClientBuilder.asyncInstantiationWithFileAndLeaseId -->
 *
 * <!-- src_embed com.azure.storage.file.datalake.specialized.DataLakeLeaseClientBuilder.asyncInstantiationWithDirectoryAndLeaseId -->
 * <pre>
 * DataLakeLeaseAsyncClient dataLakeLeaseAsyncClient = new DataLakeLeaseClientBuilder&#40;&#41;
 *     .directoryAsyncClient&#40;directoryAsyncClient&#41;
 *     .leaseId&#40;leaseId&#41;
 *     .buildAsyncClient&#40;&#41;;
 * </pre>
 * <!-- end com.azure.storage.file.datalake.specialized.DataLakeLeaseClientBuilder.asyncInstantiationWithDirectoryAndLeaseId -->
 *
 * <!-- src_embed com.azure.storage.file.datalake.specialized.DataLakeLeaseClientBuilder.asyncInstantiationWithFileSystemAndLeaseId -->
 * <pre>
 * DataLakeLeaseAsyncClient dataLakeLeaseAsyncClient = new DataLakeLeaseClientBuilder&#40;&#41;
 *     .fileSystemAsyncClient&#40;dataLakeFileSystemAsyncClient&#41;
 *     .leaseId&#40;leaseId&#41;
 *     .buildAsyncClient&#40;&#41;;
 * </pre>
 * <!-- end com.azure.storage.file.datalake.specialized.DataLakeLeaseClientBuilder.asyncInstantiationWithFileSystemAndLeaseId -->
 *
 * @see DataLakeLeaseClient
 * @see DataLakeLeaseAsyncClient
 */
@ServiceClientBuilder(serviceClients = { DataLakeLeaseClient.class, DataLakeLeaseAsyncClient.class })
public final class DataLakeLeaseClientBuilder {

    final BlobLeaseClientBuilder blobLeaseClientBuilder;

    /**
     * Creates a new instance of {@link DataLakeLeaseClientBuilder}.
     */
    public DataLakeLeaseClientBuilder() {
        blobLeaseClientBuilder = new BlobLeaseClientBuilder();
    }

    /**
     * Creates a {@link DataLakeLeaseClient} based on the configurations set in the builder.
     *
     * @return a {@link DataLakeLeaseClient} based on the configurations in this builder.
     */
    public DataLakeLeaseClient buildClient() {
        return new DataLakeLeaseClient(blobLeaseClientBuilder.buildClient());
    }

    /**
     * Creates a {@link DataLakeLeaseAsyncClient} based on the configurations set in the builder.
     *
     * @return a {@link DataLakeLeaseAsyncClient} based on the configurations in this builder.
     */
    public DataLakeLeaseAsyncClient buildAsyncClient() {
        return new DataLakeLeaseAsyncClient(blobLeaseClientBuilder.buildAsyncClient());
    }

    /**
     * Configures the builder based on the passed {@link DataLakeFileClient}. This will set the {@link HttpPipeline} and
     * {@link URL} that are used to interact with the service.
     *
     * @param dataLakeFileClient DataLakeFileClient used to configure the builder.
     * @return the updated DataLakeLeaseClientBuilder object
     * @throws NullPointerException If {@code DataLakeFileClient} is {@code null}.
     */
    public DataLakeLeaseClientBuilder fileClient(DataLakeFileClient dataLakeFileClient) {
        Objects.requireNonNull(dataLakeFileClient);
        blobLeaseClientBuilder.blobClient(getSpecializedBlobClientBuilder(dataLakeFileClient.getFileUrl(),
            dataLakeFileClient.getHttpPipeline(), dataLakeFileClient.getServiceVersion()).buildBlockBlobClient());
        return this;
    }

    /**
     * Configures the builder based on the passed {@link DataLakeFileAsyncClient}. This will set the
     * {@link HttpPipeline} and {@link URL} that are used to interact with the service.
     *
     * @param dataLakeFileAsyncClient DataLakeFileAsyncClient used to configure the builder.
     * @return the updated DataLakeLeaseClientBuilder object
     * @throws NullPointerException If {@code DataLakeFileAsyncClient} is {@code null}.
     */
    public DataLakeLeaseClientBuilder fileAsyncClient(DataLakeFileAsyncClient dataLakeFileAsyncClient) {
        Objects.requireNonNull(dataLakeFileAsyncClient);
        blobLeaseClientBuilder.blobAsyncClient(getSpecializedBlobClientBuilder(dataLakeFileAsyncClient.getFileUrl(),
            dataLakeFileAsyncClient.getHttpPipeline(), dataLakeFileAsyncClient.getServiceVersion())
                .buildBlockBlobAsyncClient());
        return this;
    }

    /**
     * Configures the builder based on the passed {@link DataLakeDirectoryClient}. This will set the
     * {@link HttpPipeline} and {@link URL} that are used to interact with the service.
     *
     * @param dataLakeDirectoryClient DataLakeDirectoryClient used to configure the builder.
     * @return the updated DataLakeLeaseClientBuilder object
     * @throws NullPointerException If {@code DataLakeDirectoryClient} is {@code null}.
     */
    public DataLakeLeaseClientBuilder directoryClient(DataLakeDirectoryClient dataLakeDirectoryClient) {
        Objects.requireNonNull(dataLakeDirectoryClient);
        blobLeaseClientBuilder.blobClient(getSpecializedBlobClientBuilder(dataLakeDirectoryClient.getDirectoryUrl(),
            dataLakeDirectoryClient.getHttpPipeline(), dataLakeDirectoryClient.getServiceVersion())
                .buildBlockBlobClient());
        return this;
    }

    /**
     * Configures the builder based on the passed {@link DataLakeDirectoryAsyncClient}. This will set the
     * {@link HttpPipeline} and {@link URL} that are used to interact with the service.
     *
     * @param dataLakeDirectoryAsyncClient DataLakeDirectoryAsyncClient used to configure the builder.
     * @return the updated DataLakeLeaseClientBuilder object
     * @throws NullPointerException If {@code DataLakeDirectoryAsyncClient} is {@code null}.
     */
    public DataLakeLeaseClientBuilder directoryAsyncClient(DataLakeDirectoryAsyncClient dataLakeDirectoryAsyncClient) {
        Objects.requireNonNull(dataLakeDirectoryAsyncClient);
        blobLeaseClientBuilder
            .blobAsyncClient(getSpecializedBlobClientBuilder(dataLakeDirectoryAsyncClient.getDirectoryUrl(),
                dataLakeDirectoryAsyncClient.getHttpPipeline(), dataLakeDirectoryAsyncClient.getServiceVersion())
                    .buildBlockBlobAsyncClient());
        return this;
    }

    /**
     * Configures the builder based on the passed {@link DataLakeFileSystemClient}. This will set the
     * {@link HttpPipeline} and {@link URL} that are used to interact with the service.
     *
     * @param dataLakeFileSystemClient DataLakeFileSystemClient used to configure the builder.
     * @return the updated DataLakeLeaseClientBuilder object
     * @throws NullPointerException If {@code dataLakeFileSystemClient} is {@code null}.
     */
    public DataLakeLeaseClientBuilder fileSystemClient(DataLakeFileSystemClient dataLakeFileSystemClient) {
        Objects.requireNonNull(dataLakeFileSystemClient);
        blobLeaseClientBuilder
            .containerClient(getBlobContainerClientBuilder(dataLakeFileSystemClient.getFileSystemUrl(),
                dataLakeFileSystemClient.getHttpPipeline(), dataLakeFileSystemClient.getServiceVersion())
                    .buildClient());
        return this;
    }

    /**
     * Configures the builder based on the passed {@link DataLakeFileSystemAsyncClient}. This will set the {@link
     * HttpPipeline} and {@link URL} that are used to interact with the service.
     *
     * @param dataLakeFileSystemAsyncClient DataLakeFileSystemAsyncClient used to configure the builder.
     * @return the updated DataLakeLeaseClientBuilder object
     * @throws NullPointerException If {@code dataLakeFileSystemAsyncClient} is {@code null}.
     */
    public DataLakeLeaseClientBuilder
        fileSystemAsyncClient(DataLakeFileSystemAsyncClient dataLakeFileSystemAsyncClient) {
        Objects.requireNonNull(dataLakeFileSystemAsyncClient);

        blobLeaseClientBuilder
            .containerClient(getBlobContainerClientBuilder(dataLakeFileSystemAsyncClient.getFileSystemUrl(),
                dataLakeFileSystemAsyncClient.getHttpPipeline(), dataLakeFileSystemAsyncClient.getServiceVersion())
                    .buildClient());
        return this;
    }

    /**
     * Sets the identifier for the lease.
     *
     * <p>If a lease ID isn't set then a {@link UUID} will be used.</p>
     *
     * @param leaseId Identifier for the lease.
     * @return the updated DataLakeLeaseClientBuilder object
     */
    public DataLakeLeaseClientBuilder leaseId(String leaseId) {
        blobLeaseClientBuilder.leaseId(leaseId);
        return this;
    }

    /**
     * Initializes a {@link SpecializedBlobClientBuilder}
     * @param dfsEndpoint The endpoint for the {@link SpecializedBlobClientBuilder}
     * @param pipeline The {@link HttpPipeline} for the {@link SpecializedBlobClientBuilder}
     * @return the {@link SpecializedBlobClientBuilder}
     */
    private SpecializedBlobClientBuilder getSpecializedBlobClientBuilder(String dfsEndpoint, HttpPipeline pipeline,
        DataLakeServiceVersion version) {
        String blobEndpoint = DataLakeImplUtils.endpointToDesiredEndpoint(dfsEndpoint, "blob", "dfs");
        return new SpecializedBlobClientBuilder().pipeline(pipeline)
            .endpoint(blobEndpoint)
            .serviceVersion(TransformUtils.toBlobServiceVersion(version));
    }

    /**
     * Initializes a {@link BlobContainerClientBuilder}
     * @param dfsEndpoint The endpoint for the {@link BlobContainerClientBuilder}
     * @param pipeline The {@link HttpPipeline} for the {@link BlobContainerClientBuilder}
     * @return the {@link BlobContainerClientBuilder}
     */
    private BlobContainerClientBuilder getBlobContainerClientBuilder(String dfsEndpoint, HttpPipeline pipeline,
        DataLakeServiceVersion version) {
        String blobEndpoint = DataLakeImplUtils.endpointToDesiredEndpoint(dfsEndpoint, "blob", "dfs");
        return new BlobContainerClientBuilder().pipeline(pipeline)
            .endpoint(blobEndpoint)
            .serviceVersion(TransformUtils.toBlobServiceVersion(version));
    }
}
