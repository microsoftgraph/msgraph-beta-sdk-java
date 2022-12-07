package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceCompliancePolicyScript implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Device compliance script Id. */
    private String _deviceComplianceScriptId;
    /** The OdataType property */
    private String _odataType;
    /** Json of the rules. */
    private byte[] _rulesContent;
    /**
     * Instantiates a new deviceCompliancePolicyScript and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceCompliancePolicyScript() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceCompliancePolicyScript
     */
    @javax.annotation.Nonnull
    public static DeviceCompliancePolicyScript createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceCompliancePolicyScript();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the deviceComplianceScriptId property value. Device compliance script Id.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceComplianceScriptId() {
        return this._deviceComplianceScriptId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(3);
        deserializerMap.put("deviceComplianceScriptId", (n) -> { this.setDeviceComplianceScriptId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("rulesContent", (n) -> { this.setRulesContent(n.getByteArrayValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the rulesContent property value. Json of the rules.
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getRulesContent() {
        return this._rulesContent;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("deviceComplianceScriptId", this.getDeviceComplianceScriptId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeByteArrayValue("rulesContent", this.getRulesContent());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the deviceComplianceScriptId property value. Device compliance script Id.
     * @param value Value to set for the deviceComplianceScriptId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceComplianceScriptId(@javax.annotation.Nullable final String value) {
        this._deviceComplianceScriptId = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the rulesContent property value. Json of the rules.
     * @param value Value to set for the rulesContent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRulesContent(@javax.annotation.Nullable final byte[] value) {
        this._rulesContent = value;
    }
}
