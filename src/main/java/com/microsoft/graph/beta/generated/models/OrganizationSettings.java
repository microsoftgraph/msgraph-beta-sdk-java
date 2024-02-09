package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrganizationSettings extends Entity implements Parsable {
    /**
     * Instantiates a new {@link OrganizationSettings} and sets the default values.
     */
    public OrganizationSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OrganizationSettings}
     */
    @jakarta.annotation.Nonnull
    public static OrganizationSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationSettings();
    }
    /**
     * Gets the contactInsights property value. Contains the properties that are configured by an administrator as a tenant-level privacy control whether to identify duplicate contacts among a user's contacts list and suggest the user to merge those contacts to have a cleaner contacts list. List contactInsights returns the settings to display or return contact insights in an organization.
     * @return a {@link InsightsSettings}
     */
    @jakarta.annotation.Nullable
    public InsightsSettings getContactInsights() {
        return this.backingStore.get("contactInsights");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("contactInsights", (n) -> { this.setContactInsights(n.getObjectValue(InsightsSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("itemInsights", (n) -> { this.setItemInsights(n.getObjectValue(InsightsSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("microsoftApplicationDataAccess", (n) -> { this.setMicrosoftApplicationDataAccess(n.getObjectValue(MicrosoftApplicationDataAccessSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("peopleInsights", (n) -> { this.setPeopleInsights(n.getObjectValue(InsightsSettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the itemInsights property value. Contains the properties that are configured by an administrator for the visibility of Microsoft Graph-derived insights, between a user and other items in Microsoft 365, such as documents or sites. List itemInsights returns the settings to display or return item insights in an organization.
     * @return a {@link InsightsSettings}
     */
    @jakarta.annotation.Nullable
    public InsightsSettings getItemInsights() {
        return this.backingStore.get("itemInsights");
    }
    /**
     * Gets the microsoftApplicationDataAccess property value. The microsoftApplicationDataAccess property
     * @return a {@link MicrosoftApplicationDataAccessSettings}
     */
    @jakarta.annotation.Nullable
    public MicrosoftApplicationDataAccessSettings getMicrosoftApplicationDataAccess() {
        return this.backingStore.get("microsoftApplicationDataAccess");
    }
    /**
     * Gets the peopleInsights property value. Contains the properties that are configured by an administrator for the visibility of a list of people relevant and working with a user in Microsoft 365. List peopleInsights returns the settings to display or return people insights in an organization.
     * @return a {@link InsightsSettings}
     */
    @jakarta.annotation.Nullable
    public InsightsSettings getPeopleInsights() {
        return this.backingStore.get("peopleInsights");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("contactInsights", this.getContactInsights());
        writer.writeObjectValue("itemInsights", this.getItemInsights());
        writer.writeObjectValue("microsoftApplicationDataAccess", this.getMicrosoftApplicationDataAccess());
        writer.writeObjectValue("peopleInsights", this.getPeopleInsights());
    }
    /**
     * Sets the contactInsights property value. Contains the properties that are configured by an administrator as a tenant-level privacy control whether to identify duplicate contacts among a user's contacts list and suggest the user to merge those contacts to have a cleaner contacts list. List contactInsights returns the settings to display or return contact insights in an organization.
     * @param value Value to set for the contactInsights property.
     */
    public void setContactInsights(@jakarta.annotation.Nullable final InsightsSettings value) {
        this.backingStore.set("contactInsights", value);
    }
    /**
     * Sets the itemInsights property value. Contains the properties that are configured by an administrator for the visibility of Microsoft Graph-derived insights, between a user and other items in Microsoft 365, such as documents or sites. List itemInsights returns the settings to display or return item insights in an organization.
     * @param value Value to set for the itemInsights property.
     */
    public void setItemInsights(@jakarta.annotation.Nullable final InsightsSettings value) {
        this.backingStore.set("itemInsights", value);
    }
    /**
     * Sets the microsoftApplicationDataAccess property value. The microsoftApplicationDataAccess property
     * @param value Value to set for the microsoftApplicationDataAccess property.
     */
    public void setMicrosoftApplicationDataAccess(@jakarta.annotation.Nullable final MicrosoftApplicationDataAccessSettings value) {
        this.backingStore.set("microsoftApplicationDataAccess", value);
    }
    /**
     * Sets the peopleInsights property value. Contains the properties that are configured by an administrator for the visibility of a list of people relevant and working with a user in Microsoft 365. List peopleInsights returns the settings to display or return people insights in an organization.
     * @param value Value to set for the peopleInsights property.
     */
    public void setPeopleInsights(@jakarta.annotation.Nullable final InsightsSettings value) {
        this.backingStore.set("peopleInsights", value);
    }
}
