package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MobilityManagementPolicy extends Entity implements Parsable {
    /** Indicates the user scope of the mobility management policy. Possible values are: none, all, selected. */
    private PolicyScope _appliesTo;
    /** Compliance URL of the mobility management application. */
    private String _complianceUrl;
    /** Description of the mobility management application. */
    private String _description;
    /** Discovery URL of the mobility management application. */
    private String _discoveryUrl;
    /** Display name of the mobility management application. */
    private String _displayName;
    /** Azure AD groups under the scope of the mobility management application if appliesTo is selected */
    private java.util.List<Group> _includedGroups;
    /** Whether policy is valid. Invalid policies may not be updated and should be deleted. */
    private Boolean _isValid;
    /** Terms of Use URL of the mobility management application. */
    private String _termsOfUseUrl;
    /**
     * Instantiates a new MobilityManagementPolicy and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MobilityManagementPolicy() {
        super();
        this.setOdataType("#microsoft.graph.mobilityManagementPolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MobilityManagementPolicy
     */
    @javax.annotation.Nonnull
    public static MobilityManagementPolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobilityManagementPolicy();
    }
    /**
     * Gets the appliesTo property value. Indicates the user scope of the mobility management policy. Possible values are: none, all, selected.
     * @return a policyScope
     */
    @javax.annotation.Nullable
    public PolicyScope getAppliesTo() {
        return this._appliesTo;
    }
    /**
     * Gets the complianceUrl property value. Compliance URL of the mobility management application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getComplianceUrl() {
        return this._complianceUrl;
    }
    /**
     * Gets the description property value. Description of the mobility management application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the discoveryUrl property value. Discovery URL of the mobility management application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDiscoveryUrl() {
        return this._discoveryUrl;
    }
    /**
     * Gets the displayName property value. Display name of the mobility management application.
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
        final MobilityManagementPolicy currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appliesTo", (n) -> { currentObject.setAppliesTo(n.getEnumValue(PolicyScope.class)); });
        deserializerMap.put("complianceUrl", (n) -> { currentObject.setComplianceUrl(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
        deserializerMap.put("discoveryUrl", (n) -> { currentObject.setDiscoveryUrl(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
        deserializerMap.put("includedGroups", (n) -> { currentObject.setIncludedGroups(n.getCollectionOfObjectValues(Group::createFromDiscriminatorValue)); });
        deserializerMap.put("isValid", (n) -> { currentObject.setIsValid(n.getBooleanValue()); });
        deserializerMap.put("termsOfUseUrl", (n) -> { currentObject.setTermsOfUseUrl(n.getStringValue()); });
        return deserializerMap
    }
    /**
     * Gets the includedGroups property value. Azure AD groups under the scope of the mobility management application if appliesTo is selected
     * @return a group
     */
    @javax.annotation.Nullable
    public java.util.List<Group> getIncludedGroups() {
        return this._includedGroups;
    }
    /**
     * Gets the isValid property value. Whether policy is valid. Invalid policies may not be updated and should be deleted.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsValid() {
        return this._isValid;
    }
    /**
     * Gets the termsOfUseUrl property value. Terms of Use URL of the mobility management application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTermsOfUseUrl() {
        return this._termsOfUseUrl;
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
        writer.writeEnumValue("appliesTo", this.getAppliesTo());
        writer.writeStringValue("complianceUrl", this.getComplianceUrl());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("discoveryUrl", this.getDiscoveryUrl());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("includedGroups", this.getIncludedGroups());
        writer.writeBooleanValue("isValid", this.getIsValid());
        writer.writeStringValue("termsOfUseUrl", this.getTermsOfUseUrl());
    }
    /**
     * Sets the appliesTo property value. Indicates the user scope of the mobility management policy. Possible values are: none, all, selected.
     * @param value Value to set for the appliesTo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppliesTo(@javax.annotation.Nullable final PolicyScope value) {
        this._appliesTo = value;
    }
    /**
     * Sets the complianceUrl property value. Compliance URL of the mobility management application.
     * @param value Value to set for the complianceUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComplianceUrl(@javax.annotation.Nullable final String value) {
        this._complianceUrl = value;
    }
    /**
     * Sets the description property value. Description of the mobility management application.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the discoveryUrl property value. Discovery URL of the mobility management application.
     * @param value Value to set for the discoveryUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDiscoveryUrl(@javax.annotation.Nullable final String value) {
        this._discoveryUrl = value;
    }
    /**
     * Sets the displayName property value. Display name of the mobility management application.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the includedGroups property value. Azure AD groups under the scope of the mobility management application if appliesTo is selected
     * @param value Value to set for the includedGroups property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncludedGroups(@javax.annotation.Nullable final java.util.List<Group> value) {
        this._includedGroups = value;
    }
    /**
     * Sets the isValid property value. Whether policy is valid. Invalid policies may not be updated and should be deleted.
     * @param value Value to set for the isValid property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsValid(@javax.annotation.Nullable final Boolean value) {
        this._isValid = value;
    }
    /**
     * Sets the termsOfUseUrl property value. Terms of Use URL of the mobility management application.
     * @param value Value to set for the termsOfUseUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTermsOfUseUrl(@javax.annotation.Nullable final String value) {
        this._termsOfUseUrl = value;
    }
}
