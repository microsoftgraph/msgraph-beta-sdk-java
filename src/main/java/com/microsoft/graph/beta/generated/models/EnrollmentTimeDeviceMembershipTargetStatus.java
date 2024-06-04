package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents the Validation status of the device membership targets. The set/get EnrollmentTimeDeviceMembershipTarget API validates the device membership targets specified by the admin to ensure that they exist, that they are of the proper type, and any other target requirements are met such as that the Intune Device Provisioning First Party App is an owner of the target.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EnrollmentTimeDeviceMembershipTargetStatus implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link EnrollmentTimeDeviceMembershipTargetStatus} and sets the default values.
     */
    public EnrollmentTimeDeviceMembershipTargetStatus() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EnrollmentTimeDeviceMembershipTargetStatus}
     */
    @jakarta.annotation.Nonnull
    public static EnrollmentTimeDeviceMembershipTargetStatus createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EnrollmentTimeDeviceMembershipTargetStatus();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("targetId", (n) -> { this.setTargetId(n.getStringValue()); });
        deserializerMap.put("targetValidationErrorCode", (n) -> { this.setTargetValidationErrorCode(n.getEnumValue(EnrollmentTimeDeviceMembershipTargetValidationErrorCode::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the targetId property value. The unique identifiers of the targets that devices will become members of when enrolled with the asociated profile.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTargetId() {
        return this.backingStore.get("targetId");
    }
    /**
     * Gets the targetValidationErrorCode property value. Represents the Validation error of the device membership target.The API will validate the device membership targets specified by the admin to ensure that they exist, that they are of the proper type, and any other target requirements are met such as that the Intune Device Provisioning First Party App is an owner of the target.
     * @return a {@link EnrollmentTimeDeviceMembershipTargetValidationErrorCode}
     */
    @jakarta.annotation.Nullable
    public EnrollmentTimeDeviceMembershipTargetValidationErrorCode getTargetValidationErrorCode() {
        return this.backingStore.get("targetValidationErrorCode");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("targetId", this.getTargetId());
        writer.writeEnumValue("targetValidationErrorCode", this.getTargetValidationErrorCode());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the targetId property value. The unique identifiers of the targets that devices will become members of when enrolled with the asociated profile.
     * @param value Value to set for the targetId property.
     */
    public void setTargetId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("targetId", value);
    }
    /**
     * Sets the targetValidationErrorCode property value. Represents the Validation error of the device membership target.The API will validate the device membership targets specified by the admin to ensure that they exist, that they are of the proper type, and any other target requirements are met such as that the Intune Device Provisioning First Party App is an owner of the target.
     * @param value Value to set for the targetValidationErrorCode property.
     */
    public void setTargetValidationErrorCode(@jakarta.annotation.Nullable final EnrollmentTimeDeviceMembershipTargetValidationErrorCode value) {
        this.backingStore.set("targetValidationErrorCode", value);
    }
}
