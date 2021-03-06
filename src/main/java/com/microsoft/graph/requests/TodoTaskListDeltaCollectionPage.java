// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.TodoTaskList;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.DeltaCollectionPage;
import com.microsoft.graph.requests.TodoTaskListDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.TodoTaskListDeltaCollectionPage;
import com.microsoft.graph.requests.TodoTaskListDeltaCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Todo Task List Delta Collection Page.
 */
public class TodoTaskListDeltaCollectionPage extends DeltaCollectionPage<TodoTaskList, TodoTaskListDeltaCollectionRequestBuilder> {

    /**
     * A collection page for TodoTaskList.
     *
     * @param response The serialized TodoTaskListDeltaCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public TodoTaskListDeltaCollectionPage(@Nonnull final TodoTaskListDeltaCollectionResponse response, @Nonnull final TodoTaskListDeltaCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for TodoTaskListDelta
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public TodoTaskListDeltaCollectionPage(@Nonnull final java.util.List<TodoTaskList> pageContents, @Nullable final TodoTaskListDeltaCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
