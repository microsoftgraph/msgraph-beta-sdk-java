package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceComplianceScriptRule implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Data types for rules.
     */
    private DataType dataType;
    /**
     * Data types for rules.
     */
    private DeviceComplianceScriptRuleDataType deviceComplianceScriptRuleDataType;
    /**
     * Operator for rules.
     */
    private DeviceComplianceScriptRulOperator deviceComplianceScriptRulOperator;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Operand specified in the rule.
     */
    private String operand;
    /**
     * Operator for rules.
     */
    private Operator operator;
    /**
     * Setting name specified in the rule.
     */
    private String settingName;
    /**
     * Instantiates a new deviceComplianceScriptRule and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceComplianceScriptRule() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceComplianceScriptRule
     */
    @javax.annotation.Nonnull
    public static DeviceComplianceScriptRule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceComplianceScriptRule();
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
     * Gets the dataType property value. Data types for rules.
     * @return a dataType
     */
    @javax.annotation.Nullable
    public DataType getDataType() {
        return this.dataType;
    }
    /**
     * Gets the deviceComplianceScriptRuleDataType property value. Data types for rules.
     * @return a deviceComplianceScriptRuleDataType
     */
    @javax.annotation.Nullable
    public DeviceComplianceScriptRuleDataType getDeviceComplianceScriptRuleDataType() {
        return this.deviceComplianceScriptRuleDataType;
    }
    /**
     * Gets the deviceComplianceScriptRulOperator property value. Operator for rules.
     * @return a deviceComplianceScriptRulOperator
     */
    @javax.annotation.Nullable
    public DeviceComplianceScriptRulOperator getDeviceComplianceScriptRulOperator() {
        return this.deviceComplianceScriptRulOperator;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("dataType", (n) -> { this.setDataType(n.getEnumValue(DataType.class)); });
        deserializerMap.put("deviceComplianceScriptRuleDataType", (n) -> { this.setDeviceComplianceScriptRuleDataType(n.getEnumValue(DeviceComplianceScriptRuleDataType.class)); });
        deserializerMap.put("deviceComplianceScriptRulOperator", (n) -> { this.setDeviceComplianceScriptRulOperator(n.getEnumValue(DeviceComplianceScriptRulOperator.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("operand", (n) -> { this.setOperand(n.getStringValue()); });
        deserializerMap.put("operator", (n) -> { this.setOperator(n.getEnumValue(Operator.class)); });
        deserializerMap.put("settingName", (n) -> { this.setSettingName(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the operand property value. Operand specified in the rule.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOperand() {
        return this.operand;
    }
    /**
     * Gets the operator property value. Operator for rules.
     * @return a operator
     */
    @javax.annotation.Nullable
    public Operator getOperator() {
        return this.operator;
    }
    /**
     * Gets the settingName property value. Setting name specified in the rule.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSettingName() {
        return this.settingName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("dataType", this.getDataType());
        writer.writeEnumValue("deviceComplianceScriptRuleDataType", this.getDeviceComplianceScriptRuleDataType());
        writer.writeEnumValue("deviceComplianceScriptRulOperator", this.getDeviceComplianceScriptRulOperator());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("operand", this.getOperand());
        writer.writeEnumValue("operator", this.getOperator());
        writer.writeStringValue("settingName", this.getSettingName());
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
     * Sets the dataType property value. Data types for rules.
     * @param value Value to set for the dataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDataType(@javax.annotation.Nullable final DataType value) {
        this.dataType = value;
    }
    /**
     * Sets the deviceComplianceScriptRuleDataType property value. Data types for rules.
     * @param value Value to set for the deviceComplianceScriptRuleDataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceComplianceScriptRuleDataType(@javax.annotation.Nullable final DeviceComplianceScriptRuleDataType value) {
        this.deviceComplianceScriptRuleDataType = value;
    }
    /**
     * Sets the deviceComplianceScriptRulOperator property value. Operator for rules.
     * @param value Value to set for the deviceComplianceScriptRulOperator property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceComplianceScriptRulOperator(@javax.annotation.Nullable final DeviceComplianceScriptRulOperator value) {
        this.deviceComplianceScriptRulOperator = value;
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
     * Sets the operand property value. Operand specified in the rule.
     * @param value Value to set for the operand property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperand(@javax.annotation.Nullable final String value) {
        this.operand = value;
    }
    /**
     * Sets the operator property value. Operator for rules.
     * @param value Value to set for the operator property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperator(@javax.annotation.Nullable final Operator value) {
        this.operator = value;
    }
    /**
     * Sets the settingName property value. Setting name specified in the rule.
     * @param value Value to set for the settingName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingName(@javax.annotation.Nullable final String value) {
        this.settingName = value;
    }
}
