package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * History Item contained in the Mobile App Troubleshooting Event.
 */
public class MobileAppTroubleshootingHistoryItem implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Time when the history item occurred.
     */
    private OffsetDateTime occurrenceDateTime;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Object containing detailed information about the error and its remediation.
     */
    private DeviceManagementTroubleshootingErrorDetails troubleshootingErrorDetails;
    /**
     * Instantiates a new mobileAppTroubleshootingHistoryItem and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MobileAppTroubleshootingHistoryItem() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mobileAppTroubleshootingHistoryItem
     */
    @javax.annotation.Nonnull
    public static MobileAppTroubleshootingHistoryItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
    @javax.annotation.Nullable
    public OffsetDateTime getOccurrenceDateTime() {
        return this.occurrenceDateTime;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the troubleshootingErrorDetails property value. Object containing detailed information about the error and its remediation.
     * @return a deviceManagementTroubleshootingErrorDetails
     */
    @javax.annotation.Nullable
    public DeviceManagementTroubleshootingErrorDetails getTroubleshootingErrorDetails() {
        return this.troubleshootingErrorDetails;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("occurrenceDateTime", this.getOccurrenceDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("troubleshootingErrorDetails", this.getTroubleshootingErrorDetails());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the occurrenceDateTime property value. Time when the history item occurred.
     * @param value Value to set for the occurrenceDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOccurrenceDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.occurrenceDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the troubleshootingErrorDetails property value. Object containing detailed information about the error and its remediation.
     * @param value Value to set for the troubleshootingErrorDetails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTroubleshootingErrorDetails(@javax.annotation.Nullable final DeviceManagementTroubleshootingErrorDetails value) {
        this.troubleshootingErrorDetails = value;
    }
}
