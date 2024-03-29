package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ApplicationSignInSummary extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ApplicationSignInSummary} and sets the default values.
     */
    public ApplicationSignInSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ApplicationSignInSummary}
     */
    @jakarta.annotation.Nonnull
    public static ApplicationSignInSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApplicationSignInSummary();
    }
    /**
     * Gets the appDisplayName property value. Name of the application that the user signed into.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppDisplayName() {
        return this.backingStore.get("appDisplayName");
    }
    /**
     * Gets the failedSignInCount property value. Count of failed sign-ins made by the application.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getFailedSignInCount() {
        return this.backingStore.get("failedSignInCount");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appDisplayName", (n) -> { this.setAppDisplayName(n.getStringValue()); });
        deserializerMap.put("failedSignInCount", (n) -> { this.setFailedSignInCount(n.getLongValue()); });
        deserializerMap.put("successfulSignInCount", (n) -> { this.setSuccessfulSignInCount(n.getLongValue()); });
        deserializerMap.put("successPercentage", (n) -> { this.setSuccessPercentage(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the successfulSignInCount property value. Count of successful sign-ins made by the application.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getSuccessfulSignInCount() {
        return this.backingStore.get("successfulSignInCount");
    }
    /**
     * Gets the successPercentage property value. Percentage of successful sign-ins made by the application.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getSuccessPercentage() {
        return this.backingStore.get("successPercentage");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appDisplayName", this.getAppDisplayName());
        writer.writeLongValue("failedSignInCount", this.getFailedSignInCount());
        writer.writeLongValue("successfulSignInCount", this.getSuccessfulSignInCount());
        writer.writeDoubleValue("successPercentage", this.getSuccessPercentage());
    }
    /**
     * Sets the appDisplayName property value. Name of the application that the user signed into.
     * @param value Value to set for the appDisplayName property.
     */
    public void setAppDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appDisplayName", value);
    }
    /**
     * Sets the failedSignInCount property value. Count of failed sign-ins made by the application.
     * @param value Value to set for the failedSignInCount property.
     */
    public void setFailedSignInCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("failedSignInCount", value);
    }
    /**
     * Sets the successfulSignInCount property value. Count of successful sign-ins made by the application.
     * @param value Value to set for the successfulSignInCount property.
     */
    public void setSuccessfulSignInCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("successfulSignInCount", value);
    }
    /**
     * Sets the successPercentage property value. Percentage of successful sign-ins made by the application.
     * @param value Value to set for the successPercentage property.
     */
    public void setSuccessPercentage(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("successPercentage", value);
    }
}
