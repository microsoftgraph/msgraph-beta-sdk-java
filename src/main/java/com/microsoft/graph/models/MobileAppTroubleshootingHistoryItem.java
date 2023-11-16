package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * History Item contained in the Mobile App Troubleshooting Event.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MobileAppTroubleshootingHistoryItem implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new MobileAppTroubleshootingHistoryItem and sets the default values.
     */
    public MobileAppTroubleshootingHistoryItem() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MobileAppTroubleshootingHistoryItem
     */
    @jakarta.annotation.Nonnull
    public static MobileAppTroubleshootingHistoryItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.mobileAppTroubleshootingAppPolicyCreationHistory": return new MobileAppTroubleshootingAppPolicyCreationHistory();
                case "#microsoft.graph.mobileAppTroubleshootingAppStateHistory": return new MobileAppTroubleshootingAppStateHistory();
                case "#microsoft.graph.mobileAppTroubleshootingAppTargetHistory": return new MobileAppTroubleshootingAppTargetHistory();
                case "#microsoft.graph.mobileAppTroubleshootingAppUpdateHistory": return new MobileAppTroubleshootingAppUpdateHistory();
                case "#microsoft.graph.mobileAppTroubleshootingDeviceCheckinHistory": return new MobileAppTroubleshootingDeviceCheckinHistory();
            }
        }
        return new MobileAppTroubleshootingHistoryItem();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("occurrenceDateTime", (n) -> { this.setOccurrenceDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("troubleshootingErrorDetails", (n) -> { this.setTroubleshootingErrorDetails(n.getObjectValue(DeviceManagementTroubleshootingErrorDetails::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the occurrenceDateTime property value. Time when the history item occurred.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getOccurrenceDateTime() {
        return this.BackingStore.get("occurrenceDateTime");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.BackingStore.get("odataType");
    }
    /**
     * Gets the troubleshootingErrorDetails property value. Object containing detailed information about the error and its remediation.
     * @return a DeviceManagementTroubleshootingErrorDetails
     */
    @jakarta.annotation.Nullable
    public DeviceManagementTroubleshootingErrorDetails getTroubleshootingErrorDetails() {
        return this.BackingStore.get("troubleshootingErrorDetails");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("occurrenceDateTime", this.getOccurrenceDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("troubleshootingErrorDetails", this.getTroubleshootingErrorDetails());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the occurrenceDateTime property value. Time when the history item occurred.
     * @param value Value to set for the occurrenceDateTime property.
     */
    public void setOccurrenceDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("occurrenceDateTime", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the troubleshootingErrorDetails property value. Object containing detailed information about the error and its remediation.
     * @param value Value to set for the troubleshootingErrorDetails property.
     */
    public void setTroubleshootingErrorDetails(@jakarta.annotation.Nullable final DeviceManagementTroubleshootingErrorDetails value) {
        this.BackingStore.set("troubleshootingErrorDetails", value);
    }
}
