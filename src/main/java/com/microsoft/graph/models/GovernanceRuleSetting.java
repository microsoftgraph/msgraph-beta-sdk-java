package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class GovernanceRuleSetting implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The OdataType property */
    private String _odataType;
    /** The id of the rule. For example, ExpirationRule and MfaRule. */
    private String _ruleIdentifier;
    /** The settings of the rule. The value is a JSON string with a list of pairs in the format of Parameter_Name:Parameter_Value. For example, {'permanentAssignment':false,'maximumGrantPeriodInMinutes':129600} */
    private String _setting;
    /**
     * Instantiates a new governanceRuleSetting and sets the default values.
     * @return a void
     */
    public GovernanceRuleSetting() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.governanceRuleSetting");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a governanceRuleSetting
     */
    @javax.annotation.Nonnull
    public static GovernanceRuleSetting createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GovernanceRuleSetting();
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
        final GovernanceRuleSetting currentObject = this;
        return new HashMap<>(3) {{
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("ruleIdentifier", (n) -> { currentObject.setRuleIdentifier(n.getStringValue()); });
            this.put("setting", (n) -> { currentObject.setSetting(n.getStringValue()); });
        }};
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
     * Gets the ruleIdentifier property value. The id of the rule. For example, ExpirationRule and MfaRule.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRuleIdentifier() {
        return this._ruleIdentifier;
    }
    /**
     * Gets the setting property value. The settings of the rule. The value is a JSON string with a list of pairs in the format of Parameter_Name:Parameter_Value. For example, {'permanentAssignment':false,'maximumGrantPeriodInMinutes':129600}
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSetting() {
        return this._setting;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("ruleIdentifier", this.getRuleIdentifier());
        writer.writeStringValue("setting", this.getSetting());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the ruleIdentifier property value. The id of the rule. For example, ExpirationRule and MfaRule.
     * @param value Value to set for the ruleIdentifier property.
     * @return a void
     */
    public void setRuleIdentifier(@javax.annotation.Nullable final String value) {
        this._ruleIdentifier = value;
    }
    /**
     * Sets the setting property value. The settings of the rule. The value is a JSON string with a list of pairs in the format of Parameter_Name:Parameter_Value. For example, {'permanentAssignment':false,'maximumGrantPeriodInMinutes':129600}
     * @param value Value to set for the setting property.
     * @return a void
     */
    public void setSetting(@javax.annotation.Nullable final String value) {
        this._setting = value;
    }
}
