package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TeamworkUserIdentity extends Identity implements Parsable {
    /**
     * Instantiates a new {@link TeamworkUserIdentity} and sets the default values.
     */
    public TeamworkUserIdentity() {
        super();
        this.setOdataType("#microsoft.graph.teamworkUserIdentity");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TeamworkUserIdentity}
     */
    @jakarta.annotation.Nonnull
    public static TeamworkUserIdentity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkUserIdentity();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("userIdentityType", (n) -> { this.setUserIdentityType(n.getEnumValue(TeamworkUserIdentityType::forValue)); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the userIdentityType property value. Type of user. Possible values are: aadUser, onPremiseAadUser, anonymousGuest, federatedUser, personalMicrosoftAccountUser, skypeUser, phoneUser, emailUser and azureCommunicationServicesUser.
     * @return a {@link TeamworkUserIdentityType}
     */
    @jakarta.annotation.Nullable
    public TeamworkUserIdentityType getUserIdentityType() {
        return this.backingStore.get("userIdentityType");
    }
    /**
     * Gets the userPrincipalName property value. User principal name (UPN) of the user.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.backingStore.get("userPrincipalName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("userIdentityType", this.getUserIdentityType());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the userIdentityType property value. Type of user. Possible values are: aadUser, onPremiseAadUser, anonymousGuest, federatedUser, personalMicrosoftAccountUser, skypeUser, phoneUser, emailUser and azureCommunicationServicesUser.
     * @param value Value to set for the userIdentityType property.
     */
    public void setUserIdentityType(@jakarta.annotation.Nullable final TeamworkUserIdentityType value) {
        this.backingStore.set("userIdentityType", value);
    }
    /**
     * Sets the userPrincipalName property value. User principal name (UPN) of the user.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userPrincipalName", value);
    }
}
