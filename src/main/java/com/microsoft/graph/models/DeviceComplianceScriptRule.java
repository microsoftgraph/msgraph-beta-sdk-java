package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
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
     * Instantiates a new DeviceComplianceScriptRule and sets the default values.
     */
    public DeviceComplianceScriptRule() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceComplianceScriptRule
     */
    @jakarta.annotation.Nonnull
    public static DeviceComplianceScriptRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceComplianceScriptRule();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the dataType property value. Data types for rules.
     * @return a DataType
     */
    @jakarta.annotation.Nullable
    public DataType getDataType() {
        return this.dataType;
    }
    /**
     * Gets the deviceComplianceScriptRuleDataType property value. Data types for rules.
     * @return a DeviceComplianceScriptRuleDataType
     */
    @jakarta.annotation.Nullable
    public DeviceComplianceScriptRuleDataType getDeviceComplianceScriptRuleDataType() {
        return this.deviceComplianceScriptRuleDataType;
    }
    /**
     * Gets the deviceComplianceScriptRulOperator property value. Operator for rules.
     * @return a DeviceComplianceScriptRulOperator
     */
    @jakarta.annotation.Nullable
    public DeviceComplianceScriptRulOperator getDeviceComplianceScriptRulOperator() {
        return this.deviceComplianceScriptRulOperator;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the operand property value. Operand specified in the rule.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOperand() {
        return this.operand;
    }
    /**
     * Gets the operator property value. Operator for rules.
     * @return a Operator
     */
    @jakarta.annotation.Nullable
    public Operator getOperator() {
        return this.operator;
    }
    /**
     * Gets the settingName property value. Setting name specified in the rule.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSettingName() {
        return this.settingName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the dataType property value. Data types for rules.
     * @param value Value to set for the dataType property.
     */
    public void setDataType(@jakarta.annotation.Nullable final DataType value) {
        this.dataType = value;
    }
    /**
     * Sets the deviceComplianceScriptRuleDataType property value. Data types for rules.
     * @param value Value to set for the deviceComplianceScriptRuleDataType property.
     */
    public void setDeviceComplianceScriptRuleDataType(@jakarta.annotation.Nullable final DeviceComplianceScriptRuleDataType value) {
        this.deviceComplianceScriptRuleDataType = value;
    }
    /**
     * Sets the deviceComplianceScriptRulOperator property value. Operator for rules.
     * @param value Value to set for the deviceComplianceScriptRulOperator property.
     */
    public void setDeviceComplianceScriptRulOperator(@jakarta.annotation.Nullable final DeviceComplianceScriptRulOperator value) {
        this.deviceComplianceScriptRulOperator = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the operand property value. Operand specified in the rule.
     * @param value Value to set for the operand property.
     */
    public void setOperand(@jakarta.annotation.Nullable final String value) {
        this.operand = value;
    }
    /**
     * Sets the operator property value. Operator for rules.
     * @param value Value to set for the operator property.
     */
    public void setOperator(@jakarta.annotation.Nullable final Operator value) {
        this.operator = value;
    }
    /**
     * Sets the settingName property value. Setting name specified in the rule.
     * @param value Value to set for the settingName property.
     */
    public void setSettingName(@jakarta.annotation.Nullable final String value) {
        this.settingName = value;
    }
}
