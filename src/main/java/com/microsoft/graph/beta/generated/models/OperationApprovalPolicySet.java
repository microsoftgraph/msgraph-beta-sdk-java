package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains the pair of OperationApprovalPolicyType and OperationApprovalPolicyPlatform determining the set of applicable OperationApprovalPolicies for a user. The OperationApprovalPolicySet complex type is used to indicate to the UX which policies are enabled for the current logged in user in order to correctly show the expected experience.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OperationApprovalPolicySet implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link OperationApprovalPolicySet} and sets the default values.
     */
    public OperationApprovalPolicySet() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OperationApprovalPolicySet}
     */
    @jakarta.annotation.Nonnull
    public static OperationApprovalPolicySet createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OperationApprovalPolicySet();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("policyPlatform", (n) -> { this.setPolicyPlatform(n.getEnumSetValue(OperationApprovalPolicyPlatform::forValue)); });
        deserializerMap.put("policyType", (n) -> { this.setPolicyType(n.getEnumValue(OperationApprovalPolicyType::forValue)); });
        return deserializerMap;
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
     * Gets the policyPlatform property value. The set of available platforms for the OperationApprovalPolicy. Allows configuration of a policy to specific platform(s) for approval. If no specific platform is required or applicable, the platform is `notApplicable`.
     * @return a {@link EnumSet<OperationApprovalPolicyPlatform>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<OperationApprovalPolicyPlatform> getPolicyPlatform() {
        return this.backingStore.get("policyPlatform");
    }
    /**
     * Gets the policyType property value. The set of available policy types that can be configured for approval. The policy type must always be defined in an OperationApprovalRequest.
     * @return a {@link OperationApprovalPolicyType}
     */
    @jakarta.annotation.Nullable
    public OperationApprovalPolicyType getPolicyType() {
        return this.backingStore.get("policyType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumSetValue("policyPlatform", this.getPolicyPlatform());
        writer.writeEnumValue("policyType", this.getPolicyType());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the policyPlatform property value. The set of available platforms for the OperationApprovalPolicy. Allows configuration of a policy to specific platform(s) for approval. If no specific platform is required or applicable, the platform is `notApplicable`.
     * @param value Value to set for the policyPlatform property.
     */
    public void setPolicyPlatform(@jakarta.annotation.Nullable final EnumSet<OperationApprovalPolicyPlatform> value) {
        this.backingStore.set("policyPlatform", value);
    }
    /**
     * Sets the policyType property value. The set of available policy types that can be configured for approval. The policy type must always be defined in an OperationApprovalRequest.
     * @param value Value to set for the policyType property.
     */
    public void setPolicyType(@jakarta.annotation.Nullable final OperationApprovalPolicyType value) {
        this.backingStore.set("policyType", value);
    }
}
