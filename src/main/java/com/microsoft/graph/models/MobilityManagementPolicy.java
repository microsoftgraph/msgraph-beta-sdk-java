package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MobilityManagementPolicy extends Entity implements Parsable {
    /**
     * Indicates the user scope of the mobility management policy. Possible values are: none, all, selected.
     */
    private PolicyScope appliesTo;
    /**
     * Compliance URL of the mobility management application.
     */
    private String complianceUrl;
    /**
     * Description of the mobility management application.
     */
    private String description;
    /**
     * Discovery URL of the mobility management application.
     */
    private String discoveryUrl;
    /**
     * Display name of the mobility management application.
     */
    private String displayName;
    /**
     * Azure AD groups under the scope of the mobility management application if appliesTo is selected
     */
    private java.util.List<Group> includedGroups;
    /**
     * Whether policy is valid. Invalid policies may not be updated and should be deleted.
     */
    private Boolean isValid;
    /**
     * Terms of Use URL of the mobility management application.
     */
    private String termsOfUseUrl;
    /**
     * Instantiates a new MobilityManagementPolicy and sets the default values.
     */
    public MobilityManagementPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MobilityManagementPolicy
     */
    @jakarta.annotation.Nonnull
    public static MobilityManagementPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobilityManagementPolicy();
    }
    /**
     * Gets the appliesTo property value. Indicates the user scope of the mobility management policy. Possible values are: none, all, selected.
     * @return a PolicyScope
     */
    @jakarta.annotation.Nullable
    public PolicyScope getAppliesTo() {
        return this.appliesTo;
    }
    /**
     * Gets the complianceUrl property value. Compliance URL of the mobility management application.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getComplianceUrl() {
        return this.complianceUrl;
    }
    /**
     * Gets the description property value. Description of the mobility management application.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the discoveryUrl property value. Discovery URL of the mobility management application.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDiscoveryUrl() {
        return this.discoveryUrl;
    }
    /**
     * Gets the displayName property value. Display name of the mobility management application.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appliesTo", (n) -> { this.setAppliesTo(n.getEnumValue(PolicyScope.class)); });
        deserializerMap.put("complianceUrl", (n) -> { this.setComplianceUrl(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("discoveryUrl", (n) -> { this.setDiscoveryUrl(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("includedGroups", (n) -> { this.setIncludedGroups(n.getCollectionOfObjectValues(Group::createFromDiscriminatorValue)); });
        deserializerMap.put("isValid", (n) -> { this.setIsValid(n.getBooleanValue()); });
        deserializerMap.put("termsOfUseUrl", (n) -> { this.setTermsOfUseUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the includedGroups property value. Azure AD groups under the scope of the mobility management application if appliesTo is selected
     * @return a java.util.List<Group>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Group> getIncludedGroups() {
        return this.includedGroups;
    }
    /**
     * Gets the isValid property value. Whether policy is valid. Invalid policies may not be updated and should be deleted.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsValid() {
        return this.isValid;
    }
    /**
     * Gets the termsOfUseUrl property value. Terms of Use URL of the mobility management application.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTermsOfUseUrl() {
        return this.termsOfUseUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAppliesTo(@jakarta.annotation.Nullable final PolicyScope value) {
        this.appliesTo = value;
    }
    /**
     * Sets the complianceUrl property value. Compliance URL of the mobility management application.
     * @param value Value to set for the complianceUrl property.
     */
    public void setComplianceUrl(@jakarta.annotation.Nullable final String value) {
        this.complianceUrl = value;
    }
    /**
     * Sets the description property value. Description of the mobility management application.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the discoveryUrl property value. Discovery URL of the mobility management application.
     * @param value Value to set for the discoveryUrl property.
     */
    public void setDiscoveryUrl(@jakarta.annotation.Nullable final String value) {
        this.discoveryUrl = value;
    }
    /**
     * Sets the displayName property value. Display name of the mobility management application.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the includedGroups property value. Azure AD groups under the scope of the mobility management application if appliesTo is selected
     * @param value Value to set for the includedGroups property.
     */
    public void setIncludedGroups(@jakarta.annotation.Nullable final java.util.List<Group> value) {
        this.includedGroups = value;
    }
    /**
     * Sets the isValid property value. Whether policy is valid. Invalid policies may not be updated and should be deleted.
     * @param value Value to set for the isValid property.
     */
    public void setIsValid(@jakarta.annotation.Nullable final Boolean value) {
        this.isValid = value;
    }
    /**
     * Sets the termsOfUseUrl property value. Terms of Use URL of the mobility management application.
     * @param value Value to set for the termsOfUseUrl property.
     */
    public void setTermsOfUseUrl(@jakarta.annotation.Nullable final String value) {
        this.termsOfUseUrl = value;
    }
}
