package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EvaluateDynamicMembershipResult implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** If a group ID is provided, the value is the membership rule for the group. If a group ID is not provided, the value is the membership rule that was provided as a parameter. For more information, see Dynamic membership rules for groups in Azure Active Directory. */
    private String _membershipRule;
    /** Provides a detailed anaylsis of the membership evaluation result. */
    private ExpressionEvaluationDetails _membershipRuleEvaluationDetails;
    /** The value is true if the user or device is a member of the group. The value can also be true if a membership rule was provided and the user or device passes the rule evaluation; otherwise false. */
    private Boolean _membershipRuleEvaluationResult;
    /**
     * Instantiates a new evaluateDynamicMembershipResult and sets the default values.
     * @return a void
     */
    public EvaluateDynamicMembershipResult() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a evaluateDynamicMembershipResult
     */
    @javax.annotation.Nonnull
    public static EvaluateDynamicMembershipResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EvaluateDynamicMembershipResult();
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
        final EvaluateDynamicMembershipResult currentObject = this;
        return new HashMap<>(3) {{
            this.put("membershipRule", (n) -> { currentObject.setMembershipRule(n.getStringValue()); });
            this.put("membershipRuleEvaluationDetails", (n) -> { currentObject.setMembershipRuleEvaluationDetails(n.getObjectValue(ExpressionEvaluationDetails::createFromDiscriminatorValue)); });
            this.put("membershipRuleEvaluationResult", (n) -> { currentObject.setMembershipRuleEvaluationResult(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the membershipRule property value. If a group ID is provided, the value is the membership rule for the group. If a group ID is not provided, the value is the membership rule that was provided as a parameter. For more information, see Dynamic membership rules for groups in Azure Active Directory.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMembershipRule() {
        return this._membershipRule;
    }
    /**
     * Gets the membershipRuleEvaluationDetails property value. Provides a detailed anaylsis of the membership evaluation result.
     * @return a expressionEvaluationDetails
     */
    @javax.annotation.Nullable
    public ExpressionEvaluationDetails getMembershipRuleEvaluationDetails() {
        return this._membershipRuleEvaluationDetails;
    }
    /**
     * Gets the membershipRuleEvaluationResult property value. The value is true if the user or device is a member of the group. The value can also be true if a membership rule was provided and the user or device passes the rule evaluation; otherwise false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMembershipRuleEvaluationResult() {
        return this._membershipRuleEvaluationResult;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("membershipRule", this.getMembershipRule());
        writer.writeObjectValue("membershipRuleEvaluationDetails", this.getMembershipRuleEvaluationDetails());
        writer.writeBooleanValue("membershipRuleEvaluationResult", this.getMembershipRuleEvaluationResult());
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
     * Sets the membershipRule property value. If a group ID is provided, the value is the membership rule for the group. If a group ID is not provided, the value is the membership rule that was provided as a parameter. For more information, see Dynamic membership rules for groups in Azure Active Directory.
     * @param value Value to set for the membershipRule property.
     * @return a void
     */
    public void setMembershipRule(@javax.annotation.Nullable final String value) {
        this._membershipRule = value;
    }
    /**
     * Sets the membershipRuleEvaluationDetails property value. Provides a detailed anaylsis of the membership evaluation result.
     * @param value Value to set for the membershipRuleEvaluationDetails property.
     * @return a void
     */
    public void setMembershipRuleEvaluationDetails(@javax.annotation.Nullable final ExpressionEvaluationDetails value) {
        this._membershipRuleEvaluationDetails = value;
    }
    /**
     * Sets the membershipRuleEvaluationResult property value. The value is true if the user or device is a member of the group. The value can also be true if a membership rule was provided and the user or device passes the rule evaluation; otherwise false.
     * @param value Value to set for the membershipRuleEvaluationResult property.
     * @return a void
     */
    public void setMembershipRuleEvaluationResult(@javax.annotation.Nullable final Boolean value) {
        this._membershipRuleEvaluationResult = value;
    }
}
