package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Teamwork extends Entity implements Parsable {
    /**
     * Instantiates a new Teamwork and sets the default values.
     */
    public Teamwork() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Teamwork
     */
    @jakarta.annotation.Nonnull
    public static Teamwork createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Teamwork();
    }
    /**
     * Gets the deletedChats property value. A collection of deleted chats.
     * @return a java.util.List<DeletedChat>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeletedChat> getDeletedChats() {
        return this.backingStore.get("deletedChats");
    }
    /**
     * Gets the deletedTeams property value. A collection of deleted teams.
     * @return a java.util.List<DeletedTeam>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeletedTeam> getDeletedTeams() {
        return this.backingStore.get("deletedTeams");
    }
    /**
     * Gets the devices property value. The Teams devices provisioned for the tenant.
     * @return a java.util.List<TeamworkDevice>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TeamworkDevice> getDevices() {
        return this.backingStore.get("devices");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deletedChats", (n) -> { this.setDeletedChats(n.getCollectionOfObjectValues(DeletedChat::createFromDiscriminatorValue)); });
        deserializerMap.put("deletedTeams", (n) -> { this.setDeletedTeams(n.getCollectionOfObjectValues(DeletedTeam::createFromDiscriminatorValue)); });
        deserializerMap.put("devices", (n) -> { this.setDevices(n.getCollectionOfObjectValues(TeamworkDevice::createFromDiscriminatorValue)); });
        deserializerMap.put("isTeamsEnabled", (n) -> { this.setIsTeamsEnabled(n.getBooleanValue()); });
        deserializerMap.put("region", (n) -> { this.setRegion(n.getStringValue()); });
        deserializerMap.put("teamsAppSettings", (n) -> { this.setTeamsAppSettings(n.getObjectValue(TeamsAppSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("teamTemplates", (n) -> { this.setTeamTemplates(n.getCollectionOfObjectValues(TeamTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("workforceIntegrations", (n) -> { this.setWorkforceIntegrations(n.getCollectionOfObjectValues(WorkforceIntegration::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isTeamsEnabled property value. Indicates whether Microsoft Teams is enabled for the organization.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsTeamsEnabled() {
        return this.backingStore.get("isTeamsEnabled");
    }
    /**
     * Gets the region property value. Represents the region of the organization.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRegion() {
        return this.backingStore.get("region");
    }
    /**
     * Gets the teamsAppSettings property value. Represents tenant-wide settings for all Teams apps in the tenant.
     * @return a TeamsAppSettings
     */
    @jakarta.annotation.Nullable
    public TeamsAppSettings getTeamsAppSettings() {
        return this.backingStore.get("teamsAppSettings");
    }
    /**
     * Gets the teamTemplates property value. The templates associated with a team.
     * @return a java.util.List<TeamTemplate>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TeamTemplate> getTeamTemplates() {
        return this.backingStore.get("teamTemplates");
    }
    /**
     * Gets the workforceIntegrations property value. A workforce integration with shifts.
     * @return a java.util.List<WorkforceIntegration>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WorkforceIntegration> getWorkforceIntegrations() {
        return this.backingStore.get("workforceIntegrations");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("deletedChats", this.getDeletedChats());
        writer.writeCollectionOfObjectValues("deletedTeams", this.getDeletedTeams());
        writer.writeCollectionOfObjectValues("devices", this.getDevices());
        writer.writeBooleanValue("isTeamsEnabled", this.getIsTeamsEnabled());
        writer.writeStringValue("region", this.getRegion());
        writer.writeObjectValue("teamsAppSettings", this.getTeamsAppSettings());
        writer.writeCollectionOfObjectValues("teamTemplates", this.getTeamTemplates());
        writer.writeCollectionOfObjectValues("workforceIntegrations", this.getWorkforceIntegrations());
    }
    /**
     * Sets the deletedChats property value. A collection of deleted chats.
     * @param value Value to set for the deletedChats property.
     */
    public void setDeletedChats(@jakarta.annotation.Nullable final java.util.List<DeletedChat> value) {
        this.backingStore.set("deletedChats", value);
    }
    /**
     * Sets the deletedTeams property value. A collection of deleted teams.
     * @param value Value to set for the deletedTeams property.
     */
    public void setDeletedTeams(@jakarta.annotation.Nullable final java.util.List<DeletedTeam> value) {
        this.backingStore.set("deletedTeams", value);
    }
    /**
     * Sets the devices property value. The Teams devices provisioned for the tenant.
     * @param value Value to set for the devices property.
     */
    public void setDevices(@jakarta.annotation.Nullable final java.util.List<TeamworkDevice> value) {
        this.backingStore.set("devices", value);
    }
    /**
     * Sets the isTeamsEnabled property value. Indicates whether Microsoft Teams is enabled for the organization.
     * @param value Value to set for the isTeamsEnabled property.
     */
    public void setIsTeamsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isTeamsEnabled", value);
    }
    /**
     * Sets the region property value. Represents the region of the organization.
     * @param value Value to set for the region property.
     */
    public void setRegion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("region", value);
    }
    /**
     * Sets the teamsAppSettings property value. Represents tenant-wide settings for all Teams apps in the tenant.
     * @param value Value to set for the teamsAppSettings property.
     */
    public void setTeamsAppSettings(@jakarta.annotation.Nullable final TeamsAppSettings value) {
        this.backingStore.set("teamsAppSettings", value);
    }
    /**
     * Sets the teamTemplates property value. The templates associated with a team.
     * @param value Value to set for the teamTemplates property.
     */
    public void setTeamTemplates(@jakarta.annotation.Nullable final java.util.List<TeamTemplate> value) {
        this.backingStore.set("teamTemplates", value);
    }
    /**
     * Sets the workforceIntegrations property value. A workforce integration with shifts.
     * @param value Value to set for the workforceIntegrations property.
     */
    public void setWorkforceIntegrations(@jakarta.annotation.Nullable final java.util.List<WorkforceIntegration> value) {
        this.backingStore.set("workforceIntegrations", value);
    }
}
