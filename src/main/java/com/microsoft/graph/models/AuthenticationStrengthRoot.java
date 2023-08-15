package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AuthenticationStrengthRoot extends Entity implements Parsable {
    /**
     * A collection of all valid authentication method combinations in the system.
     */
    private java.util.List<AuthenticationMethodModes> authenticationCombinations;
    /**
     * Names and descriptions of all valid authentication method modes in the system.
     */
    private java.util.List<AuthenticationMethodModeDetail> authenticationMethodModes;
    /**
     * The combinations property
     */
    private java.util.List<AuthenticationMethodModes> combinations;
    /**
     * A collection of authentication strength policies that exist for this tenant, including both built-in and custom policies.
     */
    private java.util.List<AuthenticationStrengthPolicy> policies;
    /**
     * Instantiates a new authenticationStrengthRoot and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public AuthenticationStrengthRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a authenticationStrengthRoot
     */
    @jakarta.annotation.Nonnull
    public static AuthenticationStrengthRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthenticationStrengthRoot();
    }
    /**
     * Gets the authenticationCombinations property value. A collection of all valid authentication method combinations in the system.
     * @return a authenticationMethodModes
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthenticationMethodModes> getAuthenticationCombinations() {
        return this.authenticationCombinations;
    }
    /**
     * Gets the authenticationMethodModes property value. Names and descriptions of all valid authentication method modes in the system.
     * @return a authenticationMethodModeDetail
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthenticationMethodModeDetail> getAuthenticationMethodModes() {
        return this.authenticationMethodModes;
    }
    /**
     * Gets the combinations property value. The combinations property
     * @return a authenticationMethodModes
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthenticationMethodModes> getCombinations() {
        return this.combinations;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authenticationCombinations", (n) -> { this.setAuthenticationCombinations(n.getCollectionOfEnumValues(AuthenticationMethodModes.class)); });
        deserializerMap.put("authenticationMethodModes", (n) -> { this.setAuthenticationMethodModes(n.getCollectionOfObjectValues(AuthenticationMethodModeDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("combinations", (n) -> { this.setCombinations(n.getCollectionOfEnumValues(AuthenticationMethodModes.class)); });
        deserializerMap.put("policies", (n) -> { this.setPolicies(n.getCollectionOfObjectValues(AuthenticationStrengthPolicy::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the policies property value. A collection of authentication strength policies that exist for this tenant, including both built-in and custom policies.
     * @return a authenticationStrengthPolicy
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthenticationStrengthPolicy> getPolicies() {
        return this.policies;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfEnumValues("authenticationCombinations", this.getAuthenticationCombinations());
        writer.writeCollectionOfObjectValues("authenticationMethodModes", this.getAuthenticationMethodModes());
        writer.writeCollectionOfEnumValues("combinations", this.getCombinations());
        writer.writeCollectionOfObjectValues("policies", this.getPolicies());
    }
    /**
     * Sets the authenticationCombinations property value. A collection of all valid authentication method combinations in the system.
     * @param value Value to set for the authenticationCombinations property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAuthenticationCombinations(@jakarta.annotation.Nullable final java.util.List<AuthenticationMethodModes> value) {
        this.authenticationCombinations = value;
    }
    /**
     * Sets the authenticationMethodModes property value. Names and descriptions of all valid authentication method modes in the system.
     * @param value Value to set for the authenticationMethodModes property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAuthenticationMethodModes(@jakarta.annotation.Nullable final java.util.List<AuthenticationMethodModeDetail> value) {
        this.authenticationMethodModes = value;
    }
    /**
     * Sets the combinations property value. The combinations property
     * @param value Value to set for the combinations property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCombinations(@jakarta.annotation.Nullable final java.util.List<AuthenticationMethodModes> value) {
        this.combinations = value;
    }
    /**
     * Sets the policies property value. A collection of authentication strength policies that exist for this tenant, including both built-in and custom policies.
     * @param value Value to set for the policies property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPolicies(@jakarta.annotation.Nullable final java.util.List<AuthenticationStrengthPolicy> value) {
        this.policies = value;
    }
}
