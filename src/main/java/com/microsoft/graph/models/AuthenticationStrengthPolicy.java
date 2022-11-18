package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AuthenticationStrengthPolicy extends Entity implements Parsable {
    /** A collection of authentication method modes that are required be used to satify this authentication strength. */
    private java.util.List<AuthenticationMethodModes> _allowedCombinations;
    /** Settings that may be used to require specific types or instances of an authentication method to be used when authenticating with a specified combination of authentication methods. */
    private java.util.List<AuthenticationCombinationConfiguration> _combinationConfigurations;
    /** The datetime when this policy was created. */
    private OffsetDateTime _createdDateTime;
    /** The human-readable description of this policy. */
    private String _description;
    /** The human-readable display name of this policy. Supports $filter (eq, ne, not , and in). */
    private String _displayName;
    /** The datetime when this policy was last modified. */
    private OffsetDateTime _modifiedDateTime;
    /** The policyType property */
    private AuthenticationStrengthPolicyType _policyType;
    /** The requirementsSatisfied property */
    private AuthenticationStrengthRequirements _requirementsSatisfied;
    /**
     * Instantiates a new AuthenticationStrengthPolicy and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AuthenticationStrengthPolicy() {
        super();
        this.setOdataType("#microsoft.graph.authenticationStrengthPolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AuthenticationStrengthPolicy
     */
    @javax.annotation.Nonnull
    public static AuthenticationStrengthPolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthenticationStrengthPolicy();
    }
    /**
     * Gets the allowedCombinations property value. A collection of authentication method modes that are required be used to satify this authentication strength.
     * @return a authenticationMethodModes
     */
    @javax.annotation.Nullable
    public java.util.List<AuthenticationMethodModes> getAllowedCombinations() {
        return this._allowedCombinations;
    }
    /**
     * Gets the combinationConfigurations property value. Settings that may be used to require specific types or instances of an authentication method to be used when authenticating with a specified combination of authentication methods.
     * @return a authenticationCombinationConfiguration
     */
    @javax.annotation.Nullable
    public java.util.List<AuthenticationCombinationConfiguration> getCombinationConfigurations() {
        return this._combinationConfigurations;
    }
    /**
     * Gets the createdDateTime property value. The datetime when this policy was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the description property value. The human-readable description of this policy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The human-readable display name of this policy. Supports $filter (eq, ne, not , and in).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AuthenticationStrengthPolicy currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("allowedCombinations", (n) -> { currentObject.setAllowedCombinations(n.getCollectionOfEnumValues(AuthenticationMethodModes.class)); });
            this.put("combinationConfigurations", (n) -> { currentObject.setCombinationConfigurations(n.getCollectionOfObjectValues(AuthenticationCombinationConfiguration::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("modifiedDateTime", (n) -> { currentObject.setModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("policyType", (n) -> { currentObject.setPolicyType(n.getEnumValue(AuthenticationStrengthPolicyType.class)); });
            this.put("requirementsSatisfied", (n) -> { currentObject.setRequirementsSatisfied(n.getEnumValue(AuthenticationStrengthRequirements.class)); });
        }};
    }
    /**
     * Gets the modifiedDateTime property value. The datetime when this policy was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getModifiedDateTime() {
        return this._modifiedDateTime;
    }
    /**
     * Gets the policyType property value. The policyType property
     * @return a authenticationStrengthPolicyType
     */
    @javax.annotation.Nullable
    public AuthenticationStrengthPolicyType getPolicyType() {
        return this._policyType;
    }
    /**
     * Gets the requirementsSatisfied property value. The requirementsSatisfied property
     * @return a authenticationStrengthRequirements
     */
    @javax.annotation.Nullable
    public AuthenticationStrengthRequirements getRequirementsSatisfied() {
        return this._requirementsSatisfied;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfEnumValues("allowedCombinations", this.getAllowedCombinations());
        writer.writeCollectionOfObjectValues("combinationConfigurations", this.getCombinationConfigurations());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("modifiedDateTime", this.getModifiedDateTime());
        writer.writeEnumValue("policyType", this.getPolicyType());
        writer.writeEnumValue("requirementsSatisfied", this.getRequirementsSatisfied());
    }
    /**
     * Sets the allowedCombinations property value. A collection of authentication method modes that are required be used to satify this authentication strength.
     * @param value Value to set for the allowedCombinations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedCombinations(@javax.annotation.Nullable final java.util.List<AuthenticationMethodModes> value) {
        this._allowedCombinations = value;
    }
    /**
     * Sets the combinationConfigurations property value. Settings that may be used to require specific types or instances of an authentication method to be used when authenticating with a specified combination of authentication methods.
     * @param value Value to set for the combinationConfigurations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCombinationConfigurations(@javax.annotation.Nullable final java.util.List<AuthenticationCombinationConfiguration> value) {
        this._combinationConfigurations = value;
    }
    /**
     * Sets the createdDateTime property value. The datetime when this policy was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the description property value. The human-readable description of this policy.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The human-readable display name of this policy. Supports $filter (eq, ne, not , and in).
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the modifiedDateTime property value. The datetime when this policy was last modified.
     * @param value Value to set for the modifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._modifiedDateTime = value;
    }
    /**
     * Sets the policyType property value. The policyType property
     * @param value Value to set for the policyType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPolicyType(@javax.annotation.Nullable final AuthenticationStrengthPolicyType value) {
        this._policyType = value;
    }
    /**
     * Sets the requirementsSatisfied property value. The requirementsSatisfied property
     * @param value Value to set for the requirementsSatisfied property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequirementsSatisfied(@javax.annotation.Nullable final AuthenticationStrengthRequirements value) {
        this._requirementsSatisfied = value;
    }
}
