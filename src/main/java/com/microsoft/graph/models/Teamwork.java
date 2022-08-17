package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Teamwork extends Entity implements Parsable {
    /** A collection of deleted teams. */
    private java.util.List<DeletedTeam> _deletedTeams;
    /** The Teams devices provisioned for the tenant. */
    private java.util.List<TeamworkDevice> _devices;
    /** Represents tenant-wide settings for all Teams apps in the tenant. */
    private TeamsAppSettings _teamsAppSettings;
    /** The templates associated with a team. */
    private java.util.List<TeamTemplate> _teamTemplates;
    /** A workforce integration with shifts. */
    private java.util.List<WorkforceIntegration> _workforceIntegrations;
    /**
     * Instantiates a new Teamwork and sets the default values.
     * @return a void
     */
    public Teamwork() {
        super();
        this.setOdataType("#microsoft.graph.teamwork");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Teamwork
     */
    @javax.annotation.Nonnull
    public static Teamwork createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Teamwork();
    }
    /**
     * Gets the deletedTeams property value. A collection of deleted teams.
     * @return a deletedTeam
     */
    @javax.annotation.Nullable
    public java.util.List<DeletedTeam> getDeletedTeams() {
        return this._deletedTeams;
    }
    /**
     * Gets the devices property value. The Teams devices provisioned for the tenant.
     * @return a teamworkDevice
     */
    @javax.annotation.Nullable
    public java.util.List<TeamworkDevice> getDevices() {
        return this._devices;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Teamwork currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("deletedTeams", (n) -> { currentObject.setDeletedTeams(n.getCollectionOfObjectValues(DeletedTeam::createFromDiscriminatorValue)); });
            this.put("devices", (n) -> { currentObject.setDevices(n.getCollectionOfObjectValues(TeamworkDevice::createFromDiscriminatorValue)); });
            this.put("teamsAppSettings", (n) -> { currentObject.setTeamsAppSettings(n.getObjectValue(TeamsAppSettings::createFromDiscriminatorValue)); });
            this.put("teamTemplates", (n) -> { currentObject.setTeamTemplates(n.getCollectionOfObjectValues(TeamTemplate::createFromDiscriminatorValue)); });
            this.put("workforceIntegrations", (n) -> { currentObject.setWorkforceIntegrations(n.getCollectionOfObjectValues(WorkforceIntegration::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the teamsAppSettings property value. Represents tenant-wide settings for all Teams apps in the tenant.
     * @return a teamsAppSettings
     */
    @javax.annotation.Nullable
    public TeamsAppSettings getTeamsAppSettings() {
        return this._teamsAppSettings;
    }
    /**
     * Gets the teamTemplates property value. The templates associated with a team.
     * @return a teamTemplate
     */
    @javax.annotation.Nullable
    public java.util.List<TeamTemplate> getTeamTemplates() {
        return this._teamTemplates;
    }
    /**
     * Gets the workforceIntegrations property value. A workforce integration with shifts.
     * @return a workforceIntegration
     */
    @javax.annotation.Nullable
    public java.util.List<WorkforceIntegration> getWorkforceIntegrations() {
        return this._workforceIntegrations;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("deletedTeams", this.getDeletedTeams());
        writer.writeCollectionOfObjectValues("devices", this.getDevices());
        writer.writeObjectValue("teamsAppSettings", this.getTeamsAppSettings());
        writer.writeCollectionOfObjectValues("teamTemplates", this.getTeamTemplates());
        writer.writeCollectionOfObjectValues("workforceIntegrations", this.getWorkforceIntegrations());
    }
    /**
     * Sets the deletedTeams property value. A collection of deleted teams.
     * @param value Value to set for the deletedTeams property.
     * @return a void
     */
    public void setDeletedTeams(@javax.annotation.Nullable final java.util.List<DeletedTeam> value) {
        this._deletedTeams = value;
    }
    /**
     * Sets the devices property value. The Teams devices provisioned for the tenant.
     * @param value Value to set for the devices property.
     * @return a void
     */
    public void setDevices(@javax.annotation.Nullable final java.util.List<TeamworkDevice> value) {
        this._devices = value;
    }
    /**
     * Sets the teamsAppSettings property value. Represents tenant-wide settings for all Teams apps in the tenant.
     * @param value Value to set for the teamsAppSettings property.
     * @return a void
     */
    public void setTeamsAppSettings(@javax.annotation.Nullable final TeamsAppSettings value) {
        this._teamsAppSettings = value;
    }
    /**
     * Sets the teamTemplates property value. The templates associated with a team.
     * @param value Value to set for the teamTemplates property.
     * @return a void
     */
    public void setTeamTemplates(@javax.annotation.Nullable final java.util.List<TeamTemplate> value) {
        this._teamTemplates = value;
    }
    /**
     * Sets the workforceIntegrations property value. A workforce integration with shifts.
     * @param value Value to set for the workforceIntegrations property.
     * @return a void
     */
    public void setWorkforceIntegrations(@javax.annotation.Nullable final java.util.List<WorkforceIntegration> value) {
        this._workforceIntegrations = value;
    }
}
