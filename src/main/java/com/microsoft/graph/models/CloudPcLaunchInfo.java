package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcLaunchInfo implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique identifier of the Cloud PC.
     */
    private String cloudPcId;
    /**
     * The connect URL of the Cloud PC.
     */
    private String cloudPcLaunchUrl;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Indicates whether the Cloud PC supports switch functionality. If the value is true, it supports switch functionality; otherwise,  false.
     */
    private Boolean windows365SwitchCompatible;
    /**
     * Indicates the reason the Cloud PC doesn't support switch. CPCOsVersionNotMeetRequirement indicates that the user needs to update their Cloud PC operation system version. CPCHardwareNotMeetRequirement indicates that the Cloud PC needs more CPU or RAM to support the functionality.
     */
    private String windows365SwitchNotCompatibleReason;
    /**
     * Instantiates a new cloudPcLaunchInfo and sets the default values.
     */
    public CloudPcLaunchInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a cloudPcLaunchInfo
     */
    @jakarta.annotation.Nonnull
    public static CloudPcLaunchInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcLaunchInfo();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the cloudPcId property value. The unique identifier of the Cloud PC.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCloudPcId() {
        return this.cloudPcId;
    }
    /**
     * Gets the cloudPcLaunchUrl property value. The connect URL of the Cloud PC.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCloudPcLaunchUrl() {
        return this.cloudPcLaunchUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("cloudPcId", (n) -> { this.setCloudPcId(n.getStringValue()); });
        deserializerMap.put("cloudPcLaunchUrl", (n) -> { this.setCloudPcLaunchUrl(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("windows365SwitchCompatible", (n) -> { this.setWindows365SwitchCompatible(n.getBooleanValue()); });
        deserializerMap.put("windows365SwitchNotCompatibleReason", (n) -> { this.setWindows365SwitchNotCompatibleReason(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the windows365SwitchCompatible property value. Indicates whether the Cloud PC supports switch functionality. If the value is true, it supports switch functionality; otherwise,  false.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWindows365SwitchCompatible() {
        return this.windows365SwitchCompatible;
    }
    /**
     * Gets the windows365SwitchNotCompatibleReason property value. Indicates the reason the Cloud PC doesn't support switch. CPCOsVersionNotMeetRequirement indicates that the user needs to update their Cloud PC operation system version. CPCHardwareNotMeetRequirement indicates that the Cloud PC needs more CPU or RAM to support the functionality.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getWindows365SwitchNotCompatibleReason() {
        return this.windows365SwitchNotCompatibleReason;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("cloudPcId", this.getCloudPcId());
        writer.writeStringValue("cloudPcLaunchUrl", this.getCloudPcLaunchUrl());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("windows365SwitchCompatible", this.getWindows365SwitchCompatible());
        writer.writeStringValue("windows365SwitchNotCompatibleReason", this.getWindows365SwitchNotCompatibleReason());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the cloudPcId property value. The unique identifier of the Cloud PC.
     * @param value Value to set for the cloudPcId property.
     */
    public void setCloudPcId(@jakarta.annotation.Nullable final String value) {
        this.cloudPcId = value;
    }
    /**
     * Sets the cloudPcLaunchUrl property value. The connect URL of the Cloud PC.
     * @param value Value to set for the cloudPcLaunchUrl property.
     */
    public void setCloudPcLaunchUrl(@jakarta.annotation.Nullable final String value) {
        this.cloudPcLaunchUrl = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the windows365SwitchCompatible property value. Indicates whether the Cloud PC supports switch functionality. If the value is true, it supports switch functionality; otherwise,  false.
     * @param value Value to set for the windows365SwitchCompatible property.
     */
    public void setWindows365SwitchCompatible(@jakarta.annotation.Nullable final Boolean value) {
        this.windows365SwitchCompatible = value;
    }
    /**
     * Sets the windows365SwitchNotCompatibleReason property value. Indicates the reason the Cloud PC doesn't support switch. CPCOsVersionNotMeetRequirement indicates that the user needs to update their Cloud PC operation system version. CPCHardwareNotMeetRequirement indicates that the Cloud PC needs more CPU or RAM to support the functionality.
     * @param value Value to set for the windows365SwitchNotCompatibleReason property.
     */
    public void setWindows365SwitchNotCompatibleReason(@jakarta.annotation.Nullable final String value) {
        this.windows365SwitchNotCompatibleReason = value;
    }
}
