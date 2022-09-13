package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AuthenticationStrengthRoot extends Entity implements Parsable {
    /** The authenticationCombinations property */
    private java.util.List<String> _authenticationCombinations;
    /** The authenticationMethodModes property */
    private java.util.List<AuthenticationMethodModeDetail> _authenticationMethodModes;
    /** The policies property */
    private java.util.List<AuthenticationStrengthPolicy> _policies;
    /**
     * Instantiates a new AuthenticationStrengthRoot and sets the default values.
     * @return a void
     */
    public AuthenticationStrengthRoot() {
        super();
        this.setOdataType("#microsoft.graph.authenticationStrengthRoot");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AuthenticationStrengthRoot
     */
    @javax.annotation.Nonnull
    public static AuthenticationStrengthRoot createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthenticationStrengthRoot();
    }
    /**
     * Gets the authenticationCombinations property value. The authenticationCombinations property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAuthenticationCombinations() {
        return this._authenticationCombinations;
    }
    /**
     * Gets the authenticationMethodModes property value. The authenticationMethodModes property
     * @return a authenticationMethodModeDetail
     */
    @javax.annotation.Nullable
    public java.util.List<AuthenticationMethodModeDetail> getAuthenticationMethodModes() {
        return this._authenticationMethodModes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AuthenticationStrengthRoot currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("authenticationCombinations", (n) -> { currentObject.setAuthenticationCombinations(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("authenticationMethodModes", (n) -> { currentObject.setAuthenticationMethodModes(n.getCollectionOfObjectValues(AuthenticationMethodModeDetail::createFromDiscriminatorValue)); });
            this.put("policies", (n) -> { currentObject.setPolicies(n.getCollectionOfObjectValues(AuthenticationStrengthPolicy::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the policies property value. The policies property
     * @return a authenticationStrengthPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<AuthenticationStrengthPolicy> getPolicies() {
        return this._policies;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("authenticationCombinations", this.getAuthenticationCombinations());
        writer.writeCollectionOfObjectValues("authenticationMethodModes", this.getAuthenticationMethodModes());
        writer.writeCollectionOfObjectValues("policies", this.getPolicies());
    }
    /**
     * Sets the authenticationCombinations property value. The authenticationCombinations property
     * @param value Value to set for the authenticationCombinations property.
     * @return a void
     */
    public void setAuthenticationCombinations(@javax.annotation.Nullable final java.util.List<String> value) {
        this._authenticationCombinations = value;
    }
    /**
     * Sets the authenticationMethodModes property value. The authenticationMethodModes property
     * @param value Value to set for the authenticationMethodModes property.
     * @return a void
     */
    public void setAuthenticationMethodModes(@javax.annotation.Nullable final java.util.List<AuthenticationMethodModeDetail> value) {
        this._authenticationMethodModes = value;
    }
    /**
     * Sets the policies property value. The policies property
     * @param value Value to set for the policies property.
     * @return a void
     */
    public void setPolicies(@javax.annotation.Nullable final java.util.List<AuthenticationStrengthPolicy> value) {
        this._policies = value;
    }
}
