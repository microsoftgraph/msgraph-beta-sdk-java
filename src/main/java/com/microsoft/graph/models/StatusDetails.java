package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class StatusDetails extends StatusBase implements Parsable {
    /**
     * Instantiates a new StatusDetails and sets the default values.
     */
    public StatusDetails() {
        super();
        this.setOdataType("#microsoft.graph.statusDetails");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a StatusDetails
     */
    @jakarta.annotation.Nonnull
    public static StatusDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new StatusDetails();
    }
    /**
     * Gets the additionalDetails property value. Additional details if there is an error.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAdditionalDetails() {
        return this.backingStore.get("additionalDetails");
    }
    /**
     * Gets the errorCategory property value. Categorizes the error code. Possible values are Failure, NonServiceFailure, Success.
     * @return a ProvisioningStatusErrorCategory
     */
    @jakarta.annotation.Nullable
    public ProvisioningStatusErrorCategory getErrorCategory() {
        return this.backingStore.get("errorCategory");
    }
    /**
     * Gets the errorCode property value. Unique error code if any occurred. Learn more
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getErrorCode() {
        return this.backingStore.get("errorCode");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("additionalDetails", (n) -> { this.setAdditionalDetails(n.getStringValue()); });
        deserializerMap.put("errorCategory", (n) -> { this.setErrorCategory(n.getEnumValue(ProvisioningStatusErrorCategory::forValue)); });
        deserializerMap.put("errorCode", (n) -> { this.setErrorCode(n.getStringValue()); });
        deserializerMap.put("reason", (n) -> { this.setReason(n.getStringValue()); });
        deserializerMap.put("recommendedAction", (n) -> { this.setRecommendedAction(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the reason property value. Summarizes the status and describes why the status happened.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getReason() {
        return this.backingStore.get("reason");
    }
    /**
     * Gets the recommendedAction property value. Provides the resolution for the corresponding error.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRecommendedAction() {
        return this.backingStore.get("recommendedAction");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("additionalDetails", this.getAdditionalDetails());
        writer.writeEnumValue("errorCategory", this.getErrorCategory());
        writer.writeStringValue("errorCode", this.getErrorCode());
        writer.writeStringValue("reason", this.getReason());
        writer.writeStringValue("recommendedAction", this.getRecommendedAction());
    }
    /**
     * Sets the additionalDetails property value. Additional details if there is an error.
     * @param value Value to set for the additionalDetails property.
     */
    public void setAdditionalDetails(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("additionalDetails", value);
    }
    /**
     * Sets the errorCategory property value. Categorizes the error code. Possible values are Failure, NonServiceFailure, Success.
     * @param value Value to set for the errorCategory property.
     */
    public void setErrorCategory(@jakarta.annotation.Nullable final ProvisioningStatusErrorCategory value) {
        this.backingStore.set("errorCategory", value);
    }
    /**
     * Sets the errorCode property value. Unique error code if any occurred. Learn more
     * @param value Value to set for the errorCode property.
     */
    public void setErrorCode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("errorCode", value);
    }
    /**
     * Sets the reason property value. Summarizes the status and describes why the status happened.
     * @param value Value to set for the reason property.
     */
    public void setReason(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("reason", value);
    }
    /**
     * Sets the recommendedAction property value. Provides the resolution for the corresponding error.
     * @param value Value to set for the recommendedAction property.
     */
    public void setRecommendedAction(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("recommendedAction", value);
    }
}
