package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceCompliancePolicyScript implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Device compliance script Id.
     */
    private String deviceComplianceScriptId;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Json of the rules.
     */
    private byte[] rulesContent;
    /**
     * Instantiates a new deviceCompliancePolicyScript and sets the default values.
     */
    public DeviceCompliancePolicyScript() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceCompliancePolicyScript
     */
    @jakarta.annotation.Nonnull
    public static DeviceCompliancePolicyScript createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceCompliancePolicyScript();
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
     * Gets the deviceComplianceScriptId property value. Device compliance script Id.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeviceComplianceScriptId() {
        return this.deviceComplianceScriptId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("deviceComplianceScriptId", (n) -> { this.setDeviceComplianceScriptId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("rulesContent", (n) -> { this.setRulesContent(n.getByteArrayValue()); });
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
     * Gets the rulesContent property value. Json of the rules.
     * @return a base64url
     */
    @jakarta.annotation.Nullable
    public byte[] getRulesContent() {
        return this.rulesContent;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("deviceComplianceScriptId", this.getDeviceComplianceScriptId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeByteArrayValue("rulesContent", this.getRulesContent());
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
     * Sets the deviceComplianceScriptId property value. Device compliance script Id.
     * @param value Value to set for the deviceComplianceScriptId property.
     */
    public void setDeviceComplianceScriptId(@jakarta.annotation.Nullable final String value) {
        this.deviceComplianceScriptId = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the rulesContent property value. Json of the rules.
     * @param value Value to set for the rulesContent property.
     */
    public void setRulesContent(@jakarta.annotation.Nullable final byte[] value) {
        this.rulesContent = value;
    }
}
