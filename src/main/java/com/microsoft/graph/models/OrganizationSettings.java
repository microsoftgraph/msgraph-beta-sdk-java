package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OrganizationSettings extends Entity implements Parsable {
    /** The contactInsights property */
    private InsightsSettings _contactInsights;
    /** Contains the properties that are configured by an administrator for the visibility of Microsoft Graph-derived insights, between a user and other items in Microsoft 365, such as documents or sites. List itemInsights returns the settings to display or return item insights in an organization. */
    private InsightsSettings _itemInsights;
    /** The microsoftApplicationDataAccess property */
    private MicrosoftApplicationDataAccessSettings _microsoftApplicationDataAccess;
    /** Contains the properties that are configured by an administrator for the visibility of a list of people relevant and working with a user in Microsoft 365. List peopleInsights returns the settings to display or return people insights in an organization. */
    private InsightsSettings _peopleInsights;
    /** Contains a collection of the properties an administrator has defined as visible on the Microsoft 365 profile card. Get organization settings returns the properties configured for profile cards for the organization. */
    private java.util.List<ProfileCardProperty> _profileCardProperties;
    /**
     * Instantiates a new organizationSettings and sets the default values.
     * @return a void
     */
    public OrganizationSettings() {
        super();
        this.setOdataType("#microsoft.graph.organizationSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a organizationSettings
     */
    @javax.annotation.Nonnull
    public static OrganizationSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationSettings();
    }
    /**
     * Gets the contactInsights property value. The contactInsights property
     * @return a insightsSettings
     */
    @javax.annotation.Nullable
    public InsightsSettings getContactInsights() {
        return this._contactInsights;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OrganizationSettings currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("contactInsights", (n) -> { currentObject.setContactInsights(n.getObjectValue(InsightsSettings::createFromDiscriminatorValue)); });
            this.put("itemInsights", (n) -> { currentObject.setItemInsights(n.getObjectValue(InsightsSettings::createFromDiscriminatorValue)); });
            this.put("microsoftApplicationDataAccess", (n) -> { currentObject.setMicrosoftApplicationDataAccess(n.getObjectValue(MicrosoftApplicationDataAccessSettings::createFromDiscriminatorValue)); });
            this.put("peopleInsights", (n) -> { currentObject.setPeopleInsights(n.getObjectValue(InsightsSettings::createFromDiscriminatorValue)); });
            this.put("profileCardProperties", (n) -> { currentObject.setProfileCardProperties(n.getCollectionOfObjectValues(ProfileCardProperty::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the itemInsights property value. Contains the properties that are configured by an administrator for the visibility of Microsoft Graph-derived insights, between a user and other items in Microsoft 365, such as documents or sites. List itemInsights returns the settings to display or return item insights in an organization.
     * @return a insightsSettings
     */
    @javax.annotation.Nullable
    public InsightsSettings getItemInsights() {
        return this._itemInsights;
    }
    /**
     * Gets the microsoftApplicationDataAccess property value. The microsoftApplicationDataAccess property
     * @return a microsoftApplicationDataAccessSettings
     */
    @javax.annotation.Nullable
    public MicrosoftApplicationDataAccessSettings getMicrosoftApplicationDataAccess() {
        return this._microsoftApplicationDataAccess;
    }
    /**
     * Gets the peopleInsights property value. Contains the properties that are configured by an administrator for the visibility of a list of people relevant and working with a user in Microsoft 365. List peopleInsights returns the settings to display or return people insights in an organization.
     * @return a insightsSettings
     */
    @javax.annotation.Nullable
    public InsightsSettings getPeopleInsights() {
        return this._peopleInsights;
    }
    /**
     * Gets the profileCardProperties property value. Contains a collection of the properties an administrator has defined as visible on the Microsoft 365 profile card. Get organization settings returns the properties configured for profile cards for the organization.
     * @return a profileCardProperty
     */
    @javax.annotation.Nullable
    public java.util.List<ProfileCardProperty> getProfileCardProperties() {
        return this._profileCardProperties;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("contactInsights", this.getContactInsights());
        writer.writeObjectValue("itemInsights", this.getItemInsights());
        writer.writeObjectValue("microsoftApplicationDataAccess", this.getMicrosoftApplicationDataAccess());
        writer.writeObjectValue("peopleInsights", this.getPeopleInsights());
        writer.writeCollectionOfObjectValues("profileCardProperties", this.getProfileCardProperties());
    }
    /**
     * Sets the contactInsights property value. The contactInsights property
     * @param value Value to set for the contactInsights property.
     * @return a void
     */
    public void setContactInsights(@javax.annotation.Nullable final InsightsSettings value) {
        this._contactInsights = value;
    }
    /**
     * Sets the itemInsights property value. Contains the properties that are configured by an administrator for the visibility of Microsoft Graph-derived insights, between a user and other items in Microsoft 365, such as documents or sites. List itemInsights returns the settings to display or return item insights in an organization.
     * @param value Value to set for the itemInsights property.
     * @return a void
     */
    public void setItemInsights(@javax.annotation.Nullable final InsightsSettings value) {
        this._itemInsights = value;
    }
    /**
     * Sets the microsoftApplicationDataAccess property value. The microsoftApplicationDataAccess property
     * @param value Value to set for the microsoftApplicationDataAccess property.
     * @return a void
     */
    public void setMicrosoftApplicationDataAccess(@javax.annotation.Nullable final MicrosoftApplicationDataAccessSettings value) {
        this._microsoftApplicationDataAccess = value;
    }
    /**
     * Sets the peopleInsights property value. Contains the properties that are configured by an administrator for the visibility of a list of people relevant and working with a user in Microsoft 365. List peopleInsights returns the settings to display or return people insights in an organization.
     * @param value Value to set for the peopleInsights property.
     * @return a void
     */
    public void setPeopleInsights(@javax.annotation.Nullable final InsightsSettings value) {
        this._peopleInsights = value;
    }
    /**
     * Sets the profileCardProperties property value. Contains a collection of the properties an administrator has defined as visible on the Microsoft 365 profile card. Get organization settings returns the properties configured for profile cards for the organization.
     * @param value Value to set for the profileCardProperties property.
     * @return a void
     */
    public void setProfileCardProperties(@javax.annotation.Nullable final java.util.List<ProfileCardProperty> value) {
        this._profileCardProperties = value;
    }
}
