// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.FileEncryptionInfo;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Content File Commit Parameter Set.
 */
public class MobileAppContentFileCommitParameterSet {
    /**
     * The file Encryption Info.
     * 
     */
    @SerializedName(value = "fileEncryptionInfo", alternate = {"FileEncryptionInfo"})
    @Expose
	@Nullable
    public FileEncryptionInfo fileEncryptionInfo;


    /**
     * Instiaciates a new MobileAppContentFileCommitParameterSet
     */
    public MobileAppContentFileCommitParameterSet() {}
    /**
     * Instiaciates a new MobileAppContentFileCommitParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected MobileAppContentFileCommitParameterSet(@Nonnull final MobileAppContentFileCommitParameterSetBuilder builder) {
        this.fileEncryptionInfo = builder.fileEncryptionInfo;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static MobileAppContentFileCommitParameterSetBuilder newBuilder() {
        return new MobileAppContentFileCommitParameterSetBuilder();
    }
    /**
     * Fluent builder for the MobileAppContentFileCommitParameterSet
     */
    public static final class MobileAppContentFileCommitParameterSetBuilder {
        /**
         * The fileEncryptionInfo parameter value
         */
        @Nullable
        protected FileEncryptionInfo fileEncryptionInfo;
        /**
         * Sets the FileEncryptionInfo
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public MobileAppContentFileCommitParameterSetBuilder withFileEncryptionInfo(@Nullable final FileEncryptionInfo val) {
            this.fileEncryptionInfo = val;
            return this;
        }
        /**
         * Instanciates a new MobileAppContentFileCommitParameterSetBuilder
         */
        @Nullable
        protected MobileAppContentFileCommitParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public MobileAppContentFileCommitParameterSet build() {
            return new MobileAppContentFileCommitParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.fileEncryptionInfo != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("fileEncryptionInfo", fileEncryptionInfo));
        }
        return result;
    }
}
