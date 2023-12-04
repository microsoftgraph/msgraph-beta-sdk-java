package com.microsoft.graph.users.item.manageddevices.item.overridecompliancestate;

import com.microsoft.graph.models.AdministratorConfiguredDeviceComplianceState;
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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OverrideComplianceStatePostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new OverrideComplianceStatePostRequestBody and sets the default values.
     */
    public OverrideComplianceStatePostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OverrideComplianceStatePostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static OverrideComplianceStatePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OverrideComplianceStatePostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
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
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the complianceState property value. Administrator configured device compliance state Enum
     * @return a AdministratorConfiguredDeviceComplianceState
     */
    @jakarta.annotation.Nullable
    public AdministratorConfiguredDeviceComplianceState getComplianceState() {
        return this.backingStore.get("complianceState");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("complianceState", (n) -> { this.setComplianceState(n.getEnumValue(AdministratorConfiguredDeviceComplianceState::forValue)); });
        deserializerMap.put("remediationUrl", (n) -> { this.setRemediationUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the remediationUrl property value. The remediationUrl property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRemediationUrl() {
        return this.backingStore.get("remediationUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("complianceState", this.getComplianceState());
        writer.writeStringValue("remediationUrl", this.getRemediationUrl());
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
     * Sets the complianceState property value. Administrator configured device compliance state Enum
     * @param value Value to set for the complianceState property.
     */
    public void setComplianceState(@jakarta.annotation.Nullable final AdministratorConfiguredDeviceComplianceState value) {
        this.backingStore.set("complianceState", value);
    }
    /**
     * Sets the remediationUrl property value. The remediationUrl property
     * @param value Value to set for the remediationUrl property.
     */
    public void setRemediationUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("remediationUrl", value);
    }
}
