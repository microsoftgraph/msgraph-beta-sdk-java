package com.microsoft.graph.groups.evaluatedynamicmembership;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EvaluateDynamicMembershipPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The memberId property
     */
    private String memberId;
    /**
     * The membershipRule property
     */
    private String membershipRule;
    /**
     * Instantiates a new evaluateDynamicMembershipPostRequestBody and sets the default values.
     */
    public EvaluateDynamicMembershipPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a evaluateDynamicMembershipPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static EvaluateDynamicMembershipPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EvaluateDynamicMembershipPostRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("memberId", (n) -> { this.setMemberId(n.getStringValue()); });
        deserializerMap.put("membershipRule", (n) -> { this.setMembershipRule(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the memberId property value. The memberId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMemberId() {
        return this.memberId;
    }
    /**
     * Gets the membershipRule property value. The membershipRule property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMembershipRule() {
        return this.membershipRule;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("memberId", this.getMemberId());
        writer.writeStringValue("membershipRule", this.getMembershipRule());
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
     * Sets the memberId property value. The memberId property
     * @param value Value to set for the memberId property.
     */
    public void setMemberId(@jakarta.annotation.Nullable final String value) {
        this.memberId = value;
    }
    /**
     * Sets the membershipRule property value. The membershipRule property
     * @param value Value to set for the membershipRule property.
     */
    public void setMembershipRule(@jakarta.annotation.Nullable final String value) {
        this.membershipRule = value;
    }
}
