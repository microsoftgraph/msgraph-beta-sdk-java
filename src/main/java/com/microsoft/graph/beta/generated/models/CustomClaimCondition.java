package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomClaimCondition extends CustomClaimConditionBase implements Parsable {
    /**
     * Instantiates a new {@link CustomClaimCondition} and sets the default values.
     */
    public CustomClaimCondition() {
        super();
        this.setOdataType("#microsoft.graph.customClaimCondition");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CustomClaimCondition}
     */
    @jakarta.annotation.Nonnull
    public static CustomClaimCondition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomClaimCondition();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("memberOf", (n) -> { this.setMemberOf(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("userType", (n) -> { this.setUserType(n.getEnumValue(ClaimConditionUserType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the memberOf property value. The memberOf property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getMemberOf() {
        return this.backingStore.get("memberOf");
    }
    /**
     * Gets the userType property value. The userType property
     * @return a {@link ClaimConditionUserType}
     */
    @jakarta.annotation.Nullable
    public ClaimConditionUserType getUserType() {
        return this.backingStore.get("userType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("memberOf", this.getMemberOf());
        writer.writeEnumValue("userType", this.getUserType());
    }
    /**
     * Sets the memberOf property value. The memberOf property
     * @param value Value to set for the memberOf property.
     */
    public void setMemberOf(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("memberOf", value);
    }
    /**
     * Sets the userType property value. The userType property
     * @param value Value to set for the userType property.
     */
    public void setUserType(@jakarta.annotation.Nullable final ClaimConditionUserType value) {
        this.backingStore.set("userType", value);
    }
}
