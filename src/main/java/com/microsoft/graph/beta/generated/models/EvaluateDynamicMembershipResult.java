package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EvaluateDynamicMembershipResult implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link EvaluateDynamicMembershipResult} and sets the default values.
     */
    public EvaluateDynamicMembershipResult() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EvaluateDynamicMembershipResult}
     */
    @jakarta.annotation.Nonnull
    public static EvaluateDynamicMembershipResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EvaluateDynamicMembershipResult();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("membershipRule", (n) -> { this.setMembershipRule(n.getStringValue()); });
        deserializerMap.put("membershipRuleEvaluationDetails", (n) -> { this.setMembershipRuleEvaluationDetails(n.getObjectValue(ExpressionEvaluationDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("membershipRuleEvaluationResult", (n) -> { this.setMembershipRuleEvaluationResult(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the membershipRule property value. If a group ID is provided, the value is the membership rule for the group. If a group ID isn&apos;t provided, the value is the membership rule that was provided as a parameter. For more information, see Dynamic membership rules for groups in Microsoft Entra ID.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMembershipRule() {
        return this.backingStore.get("membershipRule");
    }
    /**
     * Gets the membershipRuleEvaluationDetails property value. Provides a detailed analysis of the membership evaluation result.
     * @return a {@link ExpressionEvaluationDetails}
     */
    @jakarta.annotation.Nullable
    public ExpressionEvaluationDetails getMembershipRuleEvaluationDetails() {
        return this.backingStore.get("membershipRuleEvaluationDetails");
    }
    /**
     * Gets the membershipRuleEvaluationResult property value. The value is true if the user or device is a member of the group. The value can also be true if a membership rule was provided and the user or device passes the rule evaluation; otherwise false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getMembershipRuleEvaluationResult() {
        return this.backingStore.get("membershipRuleEvaluationResult");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("membershipRule", this.getMembershipRule());
        writer.writeObjectValue("membershipRuleEvaluationDetails", this.getMembershipRuleEvaluationDetails());
        writer.writeBooleanValue("membershipRuleEvaluationResult", this.getMembershipRuleEvaluationResult());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the membershipRule property value. If a group ID is provided, the value is the membership rule for the group. If a group ID isn&apos;t provided, the value is the membership rule that was provided as a parameter. For more information, see Dynamic membership rules for groups in Microsoft Entra ID.
     * @param value Value to set for the membershipRule property.
     */
    public void setMembershipRule(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("membershipRule", value);
    }
    /**
     * Sets the membershipRuleEvaluationDetails property value. Provides a detailed analysis of the membership evaluation result.
     * @param value Value to set for the membershipRuleEvaluationDetails property.
     */
    public void setMembershipRuleEvaluationDetails(@jakarta.annotation.Nullable final ExpressionEvaluationDetails value) {
        this.backingStore.set("membershipRuleEvaluationDetails", value);
    }
    /**
     * Sets the membershipRuleEvaluationResult property value. The value is true if the user or device is a member of the group. The value can also be true if a membership rule was provided and the user or device passes the rule evaluation; otherwise false.
     * @param value Value to set for the membershipRuleEvaluationResult property.
     */
    public void setMembershipRuleEvaluationResult(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("membershipRuleEvaluationResult", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
