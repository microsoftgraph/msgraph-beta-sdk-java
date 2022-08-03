package microsoft.graph.models.managedtenants;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.Entity;
/** Provides operations to manage the collection of activityStatistics entities. */
public class ManagementTemplateStepDeployment extends Entity implements Parsable {
    /** The createdByUserId property */
    private String _createdByUserId;
    /** The createdDateTime property */
    private OffsetDateTime _createdDateTime;
    /** The error property */
    private GraphAPIErrorDetails _error;
    /** The lastActionByUserId property */
    private String _lastActionByUserId;
    /** The lastActionDateTime property */
    private OffsetDateTime _lastActionDateTime;
    /** The status property */
    private ManagementTemplateDeploymentStatus _status;
    /** The templateStepVersion property */
    private ManagementTemplateStepVersion _templateStepVersion;
    /** The tenantId property */
    private String _tenantId;
    /**
     * Instantiates a new managementTemplateStepDeployment and sets the default values.
     * @return a void
     */
    public ManagementTemplateStepDeployment() {
        super();
        this.setOdataType("#microsoft.graph.managedTenants.managementTemplateStepDeployment");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managementTemplateStepDeployment
     */
    @javax.annotation.Nonnull
    public static ManagementTemplateStepDeployment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagementTemplateStepDeployment();
    }
    /**
     * Gets the createdByUserId property value. The createdByUserId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCreatedByUserId() {
        return this._createdByUserId;
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the error property value. The error property
     * @return a graphAPIErrorDetails
     */
    @javax.annotation.Nullable
    public GraphAPIErrorDetails getError() {
        return this._error;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ManagementTemplateStepDeployment currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("createdByUserId", (n) -> { currentObject.setCreatedByUserId(n.getStringValue()); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("error", (n) -> { currentObject.setError(n.getObjectValue(GraphAPIErrorDetails::createFromDiscriminatorValue)); });
            this.put("lastActionByUserId", (n) -> { currentObject.setLastActionByUserId(n.getStringValue()); });
            this.put("lastActionDateTime", (n) -> { currentObject.setLastActionDateTime(n.getOffsetDateTimeValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(ManagementTemplateDeploymentStatus.class)); });
            this.put("templateStepVersion", (n) -> { currentObject.setTemplateStepVersion(n.getObjectValue(ManagementTemplateStepVersion::createFromDiscriminatorValue)); });
            this.put("tenantId", (n) -> { currentObject.setTenantId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastActionByUserId property value. The lastActionByUserId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLastActionByUserId() {
        return this._lastActionByUserId;
    }
    /**
     * Gets the lastActionDateTime property value. The lastActionDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastActionDateTime() {
        return this._lastActionDateTime;
    }
    /**
     * Gets the status property value. The status property
     * @return a managementTemplateDeploymentStatus
     */
    @javax.annotation.Nullable
    public ManagementTemplateDeploymentStatus getStatus() {
        return this._status;
    }
    /**
     * Gets the templateStepVersion property value. The templateStepVersion property
     * @return a managementTemplateStepVersion
     */
    @javax.annotation.Nullable
    public ManagementTemplateStepVersion getTemplateStepVersion() {
        return this._templateStepVersion;
    }
    /**
     * Gets the tenantId property value. The tenantId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantId() {
        return this._tenantId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("createdByUserId", this.getCreatedByUserId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("error", this.getError());
        writer.writeStringValue("lastActionByUserId", this.getLastActionByUserId());
        writer.writeOffsetDateTimeValue("lastActionDateTime", this.getLastActionDateTime());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeObjectValue("templateStepVersion", this.getTemplateStepVersion());
        writer.writeStringValue("tenantId", this.getTenantId());
    }
    /**
     * Sets the createdByUserId property value. The createdByUserId property
     * @param value Value to set for the createdByUserId property.
     * @return a void
     */
    public void setCreatedByUserId(@javax.annotation.Nullable final String value) {
        this._createdByUserId = value;
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the error property value. The error property
     * @param value Value to set for the error property.
     * @return a void
     */
    public void setError(@javax.annotation.Nullable final GraphAPIErrorDetails value) {
        this._error = value;
    }
    /**
     * Sets the lastActionByUserId property value. The lastActionByUserId property
     * @param value Value to set for the lastActionByUserId property.
     * @return a void
     */
    public void setLastActionByUserId(@javax.annotation.Nullable final String value) {
        this._lastActionByUserId = value;
    }
    /**
     * Sets the lastActionDateTime property value. The lastActionDateTime property
     * @param value Value to set for the lastActionDateTime property.
     * @return a void
     */
    public void setLastActionDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastActionDateTime = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final ManagementTemplateDeploymentStatus value) {
        this._status = value;
    }
    /**
     * Sets the templateStepVersion property value. The templateStepVersion property
     * @param value Value to set for the templateStepVersion property.
     * @return a void
     */
    public void setTemplateStepVersion(@javax.annotation.Nullable final ManagementTemplateStepVersion value) {
        this._templateStepVersion = value;
    }
    /**
     * Sets the tenantId property value. The tenantId property
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this._tenantId = value;
    }
}
