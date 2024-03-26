package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserSubject extends ConditionalAccessWhatIfSubject implements Parsable {
    /**
     * Instantiates a new {@link UserSubject} and sets the default values.
     */
    public UserSubject() {
        super();
        this.setOdataType("#microsoft.graph.userSubject");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserSubject}
     */
    @jakarta.annotation.Nonnull
    public static UserSubject createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserSubject();
    }
    /**
     * Gets the externalTenantId property value. The externalTenantId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExternalTenantId() {
        return this.backingStore.get("externalTenantId");
    }
    /**
     * Gets the externalUserType property value. The externalUserType property
     * @return a {@link EnumSet<ConditionalAccessGuestOrExternalUserTypes>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<ConditionalAccessGuestOrExternalUserTypes> getExternalUserType() {
        return this.backingStore.get("externalUserType");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("externalTenantId", (n) -> { this.setExternalTenantId(n.getStringValue()); });
        deserializerMap.put("externalUserType", (n) -> { this.setExternalUserType(n.getEnumSetValue(ConditionalAccessGuestOrExternalUserTypes::forValue)); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the userId property value. The userId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.backingStore.get("userId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("externalTenantId", this.getExternalTenantId());
        writer.writeEnumSetValue("externalUserType", this.getExternalUserType());
        writer.writeStringValue("userId", this.getUserId());
    }
    /**
     * Sets the externalTenantId property value. The externalTenantId property
     * @param value Value to set for the externalTenantId property.
     */
    public void setExternalTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("externalTenantId", value);
    }
    /**
     * Sets the externalUserType property value. The externalUserType property
     * @param value Value to set for the externalUserType property.
     */
    public void setExternalUserType(@jakarta.annotation.Nullable final EnumSet<ConditionalAccessGuestOrExternalUserTypes> value) {
        this.backingStore.set("externalUserType", value);
    }
    /**
     * Sets the userId property value. The userId property
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userId", value);
    }
}
