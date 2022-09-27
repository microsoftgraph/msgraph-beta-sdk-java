package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DevicesFilter implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The mode property */
    private CrossTenantAccessPolicyTargetConfigurationAccessType _mode;
    /** The OdataType property */
    private String _odataType;
    /** The rule property */
    private String _rule;
    /**
     * Instantiates a new devicesFilter and sets the default values.
     * @return a void
     */
    public DevicesFilter() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.devicesFilter");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a devicesFilter
     */
    @javax.annotation.Nonnull
    public static DevicesFilter createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DevicesFilter();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DevicesFilter currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(3) {{
            this.put("mode", (n) -> { currentObject.setMode(n.getEnumValue(CrossTenantAccessPolicyTargetConfigurationAccessType.class)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("rule", (n) -> { currentObject.setRule(n.getStringValue()); });
        }};
    }
    /**
     * Gets the mode property value. The mode property
     * @return a crossTenantAccessPolicyTargetConfigurationAccessType
     */
    @javax.annotation.Nullable
    public CrossTenantAccessPolicyTargetConfigurationAccessType getMode() {
        return this._mode;
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
     * Gets the rule property value. The rule property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRule() {
        return this._rule;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("mode", this.getMode());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("rule", this.getRule());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the mode property value. The mode property
     * @param value Value to set for the mode property.
     * @return a void
     */
    public void setMode(@javax.annotation.Nullable final CrossTenantAccessPolicyTargetConfigurationAccessType value) {
        this._mode = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the rule property value. The rule property
     * @param value Value to set for the rule property.
     * @return a void
     */
    public void setRule(@javax.annotation.Nullable final String value) {
        this._rule = value;
    }
}
