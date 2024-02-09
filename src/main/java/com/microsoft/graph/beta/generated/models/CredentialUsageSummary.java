package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CredentialUsageSummary extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CredentialUsageSummary} and sets the default values.
     */
    public CredentialUsageSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CredentialUsageSummary}
     */
    @jakarta.annotation.Nonnull
    public static CredentialUsageSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CredentialUsageSummary();
    }
    /**
     * Gets the authMethod property value. The authMethod property
     * @return a {@link UsageAuthMethod}
     */
    @jakarta.annotation.Nullable
    public UsageAuthMethod getAuthMethod() {
        return this.backingStore.get("authMethod");
    }
    /**
     * Gets the failureActivityCount property value. Provides the count of failed resets or registration data.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getFailureActivityCount() {
        return this.backingStore.get("failureActivityCount");
    }
    /**
     * Gets the feature property value. The feature property
     * @return a {@link FeatureType}
     */
    @jakarta.annotation.Nullable
    public FeatureType getFeature() {
        return this.backingStore.get("feature");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authMethod", (n) -> { this.setAuthMethod(n.getEnumValue(UsageAuthMethod::forValue)); });
        deserializerMap.put("failureActivityCount", (n) -> { this.setFailureActivityCount(n.getLongValue()); });
        deserializerMap.put("feature", (n) -> { this.setFeature(n.getEnumValue(FeatureType::forValue)); });
        deserializerMap.put("successfulActivityCount", (n) -> { this.setSuccessfulActivityCount(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the successfulActivityCount property value. Provides the count of successful registrations or resets.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getSuccessfulActivityCount() {
        return this.backingStore.get("successfulActivityCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAuthMethod(@jakarta.annotation.Nullable final UsageAuthMethod value) {
        this.backingStore.set("authMethod", value);
    }
    /**
     * Sets the failureActivityCount property value. Provides the count of failed resets or registration data.
     * @param value Value to set for the failureActivityCount property.
     */
    public void setFailureActivityCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("failureActivityCount", value);
    }
    /**
     * Sets the feature property value. The feature property
     * @param value Value to set for the feature property.
     */
    public void setFeature(@jakarta.annotation.Nullable final FeatureType value) {
        this.backingStore.set("feature", value);
    }
    /**
     * Sets the successfulActivityCount property value. Provides the count of successful registrations or resets.
     * @param value Value to set for the successfulActivityCount property.
     */
    public void setSuccessfulActivityCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("successfulActivityCount", value);
    }
}
