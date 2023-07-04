package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CredentialUsageSummary extends Entity implements Parsable {
    /**
     * The authMethod property
     */
    private UsageAuthMethod authMethod;
    /**
     * Provides the count of failed resets or registration data.
     */
    private Long failureActivityCount;
    /**
     * The feature property
     */
    private FeatureType feature;
    /**
     * Provides the count of successful registrations or resets.
     */
    private Long successfulActivityCount;
    /**
     * Instantiates a new CredentialUsageSummary and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CredentialUsageSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CredentialUsageSummary
     */
    @javax.annotation.Nonnull
    public static CredentialUsageSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CredentialUsageSummary();
    }
    /**
     * Gets the authMethod property value. The authMethod property
     * @return a UsageAuthMethod
     */
    @javax.annotation.Nullable
    public UsageAuthMethod getAuthMethod() {
        return this.authMethod;
    }
    /**
     * Gets the failureActivityCount property value. Provides the count of failed resets or registration data.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getFailureActivityCount() {
        return this.failureActivityCount;
    }
    /**
     * Gets the feature property value. The feature property
     * @return a FeatureType
     */
    @javax.annotation.Nullable
    public FeatureType getFeature() {
        return this.feature;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authMethod", (n) -> { this.setAuthMethod(n.getEnumValue(UsageAuthMethod.class)); });
        deserializerMap.put("failureActivityCount", (n) -> { this.setFailureActivityCount(n.getLongValue()); });
        deserializerMap.put("feature", (n) -> { this.setFeature(n.getEnumValue(FeatureType.class)); });
        deserializerMap.put("successfulActivityCount", (n) -> { this.setSuccessfulActivityCount(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the successfulActivityCount property value. Provides the count of successful registrations or resets.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSuccessfulActivityCount() {
        return this.successfulActivityCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("authMethod", this.getAuthMethod());
        writer.writeLongValue("failureActivityCount", this.getFailureActivityCount());
        writer.writeEnumValue("feature", this.getFeature());
        writer.writeLongValue("successfulActivityCount", this.getSuccessfulActivityCount());
    }
    /**
     * Sets the authMethod property value. The authMethod property
     * @param value Value to set for the authMethod property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuthMethod(@javax.annotation.Nullable final UsageAuthMethod value) {
        this.authMethod = value;
    }
    /**
     * Sets the failureActivityCount property value. Provides the count of failed resets or registration data.
     * @param value Value to set for the failureActivityCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFailureActivityCount(@javax.annotation.Nullable final Long value) {
        this.failureActivityCount = value;
    }
    /**
     * Sets the feature property value. The feature property
     * @param value Value to set for the feature property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFeature(@javax.annotation.Nullable final FeatureType value) {
        this.feature = value;
    }
    /**
     * Sets the successfulActivityCount property value. Provides the count of successful registrations or resets.
     * @param value Value to set for the successfulActivityCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSuccessfulActivityCount(@javax.annotation.Nullable final Long value) {
        this.successfulActivityCount = value;
    }
}
