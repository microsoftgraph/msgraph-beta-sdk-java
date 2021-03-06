// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.DataPolicyOperation;
import com.microsoft.graph.requests.DataPolicyOperationCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.DataPolicyOperationCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Data Policy Operation Collection Page.
 */
public class DataPolicyOperationCollectionPage extends BaseCollectionPage<DataPolicyOperation, DataPolicyOperationCollectionRequestBuilder> {

    /**
     * A collection page for DataPolicyOperation
     *
     * @param response the serialized DataPolicyOperationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DataPolicyOperationCollectionPage(@Nonnull final DataPolicyOperationCollectionResponse response, @Nonnull final DataPolicyOperationCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for DataPolicyOperation
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DataPolicyOperationCollectionPage(@Nonnull final java.util.List<DataPolicyOperation> pageContents, @Nullable final DataPolicyOperationCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
