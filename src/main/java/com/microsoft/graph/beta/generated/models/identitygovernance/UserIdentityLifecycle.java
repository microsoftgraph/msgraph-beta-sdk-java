package com.microsoft.graph.beta.models.identitygovernance;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserIdentityLifecycle extends IdentityLifecycle implements Parsable {
    /**
     * Instantiates a new {@link UserIdentityLifecycle} and sets the default values.
     */
    public UserIdentityLifecycle() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.userIdentityLifecycle");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserIdentityLifecycle}
     */
    @jakarta.annotation.Nonnull
    public static UserIdentityLifecycle createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserIdentityLifecycle();
    }
    /**
     * Gets the complianceState property value. The complianceState property
     * @return a {@link ComplianceState}
     */
    @jakarta.annotation.Nullable
    public ComplianceState getComplianceState() {
        return this.backingStore.get("complianceState");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("complianceState", (n) -> { this.setComplianceState(n.getEnumValue(ComplianceState::forValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("complianceState", this.getComplianceState());
    }
    /**
     * Sets the complianceState property value. The complianceState property
     * @param value Value to set for the complianceState property.
     */
    public void setComplianceState(@jakarta.annotation.Nullable final ComplianceState value) {
        this.backingStore.set("complianceState", value);
    }
}
