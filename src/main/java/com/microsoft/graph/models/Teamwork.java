package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Teamwork extends Entity implements Parsable {
    /**
     * The deletedChats property
     */
    private java.util.List<DeletedChat> deletedChats;
    /**
     * A collection of deleted teams.
     */
    private java.util.List<DeletedTeam> deletedTeams;
    /**
     * The Teams devices provisioned for the tenant.
     */
    private java.util.List<TeamworkDevice> devices;
    /**
     * Represents tenant-wide settings for all Teams apps in the tenant.
     */
    private TeamsAppSettings teamsAppSettings;
    /**
     * The templates associated with a team.
     */
    private java.util.List<TeamTemplate> teamTemplates;
    /**
     * A workforce integration with shifts.
     */
    private java.util.List<WorkforceIntegration> workforceIntegrations;
    /**
     * Instantiates a new teamwork and sets the default values.
     */
    public Teamwork() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamwork
     */
    @jakarta.annotation.Nonnull
    public static Teamwork createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Teamwork();
    }
    /**
     * Gets the deletedChats property value. The deletedChats property
     * @return a deletedChat
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeletedChat> getDeletedChats() {
        return this.deletedChats;
    }
    /**
     * Gets the deletedTeams property value. A collection of deleted teams.
     * @return a deletedTeam
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeletedTeam> getDeletedTeams() {
        return this.deletedTeams;
    }
    /**
     * Gets the devices property value. The Teams devices provisioned for the tenant.
     * @return a teamworkDevice
     */
    @jakarta.annotation.Nullable
    public java.util.List<TeamworkDevice> getDevices() {
        return this.devices;
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
        deserializerMap.put("teamsAppSettings", (n) -> { this.setTeamsAppSettings(n.getObjectValue(TeamsAppSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("teamTemplates", (n) -> { this.setTeamTemplates(n.getCollectionOfObjectValues(TeamTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("workforceIntegrations", (n) -> { this.setWorkforceIntegrations(n.getCollectionOfObjectValues(WorkforceIntegration::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the teamsAppSettings property value. Represents tenant-wide settings for all Teams apps in the tenant.
     * @return a teamsAppSettings
     */
    @jakarta.annotation.Nullable
    public TeamsAppSettings getTeamsAppSettings() {
        return this.teamsAppSettings;
    }
    /**
     * Gets the teamTemplates property value. The templates associated with a team.
     * @return a teamTemplate
     */
    @jakarta.annotation.Nullable
    public java.util.List<TeamTemplate> getTeamTemplates() {
        return this.teamTemplates;
    }
    /**
     * Gets the workforceIntegrations property value. A workforce integration with shifts.
     * @return a workforceIntegration
     */
    @jakarta.annotation.Nullable
    public java.util.List<WorkforceIntegration> getWorkforceIntegrations() {
        return this.workforceIntegrations;
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
        writer.writeObjectValue("teamsAppSettings", this.getTeamsAppSettings());
        writer.writeCollectionOfObjectValues("teamTemplates", this.getTeamTemplates());
        writer.writeCollectionOfObjectValues("workforceIntegrations", this.getWorkforceIntegrations());
    }
    /**
     * Sets the deletedChats property value. The deletedChats property
     * @param value Value to set for the deletedChats property.
     */
    public void setDeletedChats(@jakarta.annotation.Nullable final java.util.List<DeletedChat> value) {
        this.deletedChats = value;
    }
    /**
     * Sets the deletedTeams property value. A collection of deleted teams.
     * @param value Value to set for the deletedTeams property.
     */
    public void setDeletedTeams(@jakarta.annotation.Nullable final java.util.List<DeletedTeam> value) {
        this.deletedTeams = value;
    }
    /**
     * Sets the devices property value. The Teams devices provisioned for the tenant.
     * @param value Value to set for the devices property.
     */
    public void setDevices(@jakarta.annotation.Nullable final java.util.List<TeamworkDevice> value) {
        this.devices = value;
    }
    /**
     * Sets the teamsAppSettings property value. Represents tenant-wide settings for all Teams apps in the tenant.
     * @param value Value to set for the teamsAppSettings property.
     */
    public void setTeamsAppSettings(@jakarta.annotation.Nullable final TeamsAppSettings value) {
        this.teamsAppSettings = value;
    }
    /**
     * Sets the teamTemplates property value. The templates associated with a team.
     * @param value Value to set for the teamTemplates property.
     */
    public void setTeamTemplates(@jakarta.annotation.Nullable final java.util.List<TeamTemplate> value) {
        this.teamTemplates = value;
    }
    /**
     * Sets the workforceIntegrations property value. A workforce integration with shifts.
     * @param value Value to set for the workforceIntegrations property.
     */
    public void setWorkforceIntegrations(@jakarta.annotation.Nullable final java.util.List<WorkforceIntegration> value) {
        this.workforceIntegrations = value;
    }
}
