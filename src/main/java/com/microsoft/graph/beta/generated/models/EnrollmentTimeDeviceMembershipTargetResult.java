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
 * The EnrollmentTimeDeviceMembershipTargetResult entity represents the results of the set/get EnrollmentTimeDeviceMembershipTarget request. The set/get EnrollmentTimeDeviceMembershipTarget API validates the device membership targets specified by the admin to ensure that they exist, that they are of the proper type, and any other target requirements are met such as that the Intune Device Provisioning First Party App is an owner of the target. Failures other than validation will result in 500 else validationSucceeded will be true or false if any of the validation fails for EnrollmentTimeDeviceMembershipTarget.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EnrollmentTimeDeviceMembershipTargetResult implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link EnrollmentTimeDeviceMembershipTargetResult} and sets the default values.
     */
    public EnrollmentTimeDeviceMembershipTargetResult() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EnrollmentTimeDeviceMembershipTargetResult}
     */
    @jakarta.annotation.Nonnull
    public static EnrollmentTimeDeviceMembershipTargetResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EnrollmentTimeDeviceMembershipTargetResult();
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
     * Gets the enrollmentTimeDeviceMembershipTargetValidationStatuses property value. A list of validation status of the memberships targetted to profile. This collection can contain a maximum of 1 elements.
     * @return a {@link java.util.List<EnrollmentTimeDeviceMembershipTargetStatus>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EnrollmentTimeDeviceMembershipTargetStatus> getEnrollmentTimeDeviceMembershipTargetValidationStatuses() {
        return this.backingStore.get("enrollmentTimeDeviceMembershipTargetValidationStatuses");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("enrollmentTimeDeviceMembershipTargetValidationStatuses", (n) -> { this.setEnrollmentTimeDeviceMembershipTargetValidationStatuses(n.getCollectionOfObjectValues(EnrollmentTimeDeviceMembershipTargetStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("validationSucceeded", (n) -> { this.setValidationSucceeded(n.getBooleanValue()); });
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
     * Gets the validationSucceeded property value. Indicates if validations succeeded for the device membership target. When &apos;true&apos;, the device membership target validation found no issues. When &apos;false&apos;, the device membership target validation found issues. default - false
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getValidationSucceeded() {
        return this.backingStore.get("validationSucceeded");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("enrollmentTimeDeviceMembershipTargetValidationStatuses", this.getEnrollmentTimeDeviceMembershipTargetValidationStatuses());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("validationSucceeded", this.getValidationSucceeded());
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
     * Sets the enrollmentTimeDeviceMembershipTargetValidationStatuses property value. A list of validation status of the memberships targetted to profile. This collection can contain a maximum of 1 elements.
     * @param value Value to set for the enrollmentTimeDeviceMembershipTargetValidationStatuses property.
     */
    public void setEnrollmentTimeDeviceMembershipTargetValidationStatuses(@jakarta.annotation.Nullable final java.util.List<EnrollmentTimeDeviceMembershipTargetStatus> value) {
        this.backingStore.set("enrollmentTimeDeviceMembershipTargetValidationStatuses", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the validationSucceeded property value. Indicates if validations succeeded for the device membership target. When &apos;true&apos;, the device membership target validation found no issues. When &apos;false&apos;, the device membership target validation found issues. default - false
     * @param value Value to set for the validationSucceeded property.
     */
    public void setValidationSucceeded(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("validationSucceeded", value);
    }
}
