package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementReports extends Entity implements Parsable {
    /** Entity representing the configuration of a cached report */
    private java.util.List<DeviceManagementCachedReportConfiguration> _cachedReportConfigurations;
    /** Entity representing a job to export a report */
    private java.util.List<DeviceManagementExportJob> _exportJobs;
    /**
     * Instantiates a new DeviceManagementReports and sets the default values.
     * @return a void
     */
    public DeviceManagementReports() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementReports");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementReports
     */
    @javax.annotation.Nonnull
    public static DeviceManagementReports createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementReports();
    }
    /**
     * Gets the cachedReportConfigurations property value. Entity representing the configuration of a cached report
     * @return a deviceManagementCachedReportConfiguration
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementCachedReportConfiguration> getCachedReportConfigurations() {
        return this._cachedReportConfigurations;
    }
    /**
     * Gets the exportJobs property value. Entity representing a job to export a report
     * @return a deviceManagementExportJob
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementExportJob> getExportJobs() {
        return this._exportJobs;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementReports currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("cachedReportConfigurations", (n) -> { currentObject.setCachedReportConfigurations(n.getCollectionOfObjectValues(DeviceManagementCachedReportConfiguration::createFromDiscriminatorValue)); });
            this.put("exportJobs", (n) -> { currentObject.setExportJobs(n.getCollectionOfObjectValues(DeviceManagementExportJob::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("cachedReportConfigurations", this.getCachedReportConfigurations());
        writer.writeCollectionOfObjectValues("exportJobs", this.getExportJobs());
    }
    /**
     * Sets the cachedReportConfigurations property value. Entity representing the configuration of a cached report
     * @param value Value to set for the cachedReportConfigurations property.
     * @return a void
     */
    public void setCachedReportConfigurations(@javax.annotation.Nullable final java.util.List<DeviceManagementCachedReportConfiguration> value) {
        this._cachedReportConfigurations = value;
    }
    /**
     * Sets the exportJobs property value. Entity representing a job to export a report
     * @param value Value to set for the exportJobs property.
     * @return a void
     */
    public void setExportJobs(@javax.annotation.Nullable final java.util.List<DeviceManagementExportJob> value) {
        this._exportJobs = value;
    }
}
