package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AuthenticationMethodsRoot extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AuthenticationMethodsRoot} and sets the default values.
     */
    public AuthenticationMethodsRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AuthenticationMethodsRoot}
     */
    @jakarta.annotation.Nonnull
    public static AuthenticationMethodsRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthenticationMethodsRoot();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("userEventsSummary", (n) -> { this.setUserEventsSummary(n.getCollectionOfObjectValues(UserEventsSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("userMfaSignInSummary", (n) -> { this.setUserMfaSignInSummary(n.getCollectionOfObjectValues(UserMfaSignInSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("userPasswordResetsAndChangesSummary", (n) -> { this.setUserPasswordResetsAndChangesSummary(n.getCollectionOfObjectValues(UserPasswordResetsAndChangesSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("userRegistrationDetails", (n) -> { this.setUserRegistrationDetails(n.getCollectionOfObjectValues(UserRegistrationDetails::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the userEventsSummary property value. Represents a specific user MFA/SSPR registration or reset event, including whether the event was successful, which authentication method was targeted, and failure reason if any.
     * @return a {@link java.util.List<UserEventsSummary>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserEventsSummary> getUserEventsSummary() {
        return this.backingStore.get("userEventsSummary");
    }
    /**
     * Gets the userMfaSignInSummary property value. Represents the total count of MFA vs non-MFA sign-in counts for a specified period.
     * @return a {@link java.util.List<UserMfaSignInSummary>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserMfaSignInSummary> getUserMfaSignInSummary() {
        return this.backingStore.get("userMfaSignInSummary");
    }
    /**
     * Gets the userPasswordResetsAndChangesSummary property value. Represents the summary of password resets and changes for a specific day. This includes the number of password resets that were self-service and those triggered by an administrator.
     * @return a {@link java.util.List<UserPasswordResetsAndChangesSummary>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserPasswordResetsAndChangesSummary> getUserPasswordResetsAndChangesSummary() {
        return this.backingStore.get("userPasswordResetsAndChangesSummary");
    }
    /**
     * Gets the userRegistrationDetails property value. Represents the state of a user&apos;s authentication methods, including which methods are registered and which features the user is registered and capable of (such as multifactor authentication, self-service password reset, and passwordless authentication).
     * @return a {@link java.util.List<UserRegistrationDetails>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserRegistrationDetails> getUserRegistrationDetails() {
        return this.backingStore.get("userRegistrationDetails");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("userEventsSummary", this.getUserEventsSummary());
        writer.writeCollectionOfObjectValues("userMfaSignInSummary", this.getUserMfaSignInSummary());
        writer.writeCollectionOfObjectValues("userPasswordResetsAndChangesSummary", this.getUserPasswordResetsAndChangesSummary());
        writer.writeCollectionOfObjectValues("userRegistrationDetails", this.getUserRegistrationDetails());
    }
    /**
     * Sets the userEventsSummary property value. Represents a specific user MFA/SSPR registration or reset event, including whether the event was successful, which authentication method was targeted, and failure reason if any.
     * @param value Value to set for the userEventsSummary property.
     */
    public void setUserEventsSummary(@jakarta.annotation.Nullable final java.util.List<UserEventsSummary> value) {
        this.backingStore.set("userEventsSummary", value);
    }
    /**
     * Sets the userMfaSignInSummary property value. Represents the total count of MFA vs non-MFA sign-in counts for a specified period.
     * @param value Value to set for the userMfaSignInSummary property.
     */
    public void setUserMfaSignInSummary(@jakarta.annotation.Nullable final java.util.List<UserMfaSignInSummary> value) {
        this.backingStore.set("userMfaSignInSummary", value);
    }
    /**
     * Sets the userPasswordResetsAndChangesSummary property value. Represents the summary of password resets and changes for a specific day. This includes the number of password resets that were self-service and those triggered by an administrator.
     * @param value Value to set for the userPasswordResetsAndChangesSummary property.
     */
    public void setUserPasswordResetsAndChangesSummary(@jakarta.annotation.Nullable final java.util.List<UserPasswordResetsAndChangesSummary> value) {
        this.backingStore.set("userPasswordResetsAndChangesSummary", value);
    }
    /**
     * Sets the userRegistrationDetails property value. Represents the state of a user&apos;s authentication methods, including which methods are registered and which features the user is registered and capable of (such as multifactor authentication, self-service password reset, and passwordless authentication).
     * @param value Value to set for the userRegistrationDetails property.
     */
    public void setUserRegistrationDetails(@jakarta.annotation.Nullable final java.util.List<UserRegistrationDetails> value) {
        this.backingStore.set("userRegistrationDetails", value);
    }
}
