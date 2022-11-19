package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudPcReports extends Entity implements Parsable {
    /** The export jobs created for downloading reports. */
    private java.util.List<CloudPcExportJob> _exportJobs;
    /**
     * Instantiates a new CloudPcReports and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CloudPcReports() {
        super();
        this.setOdataType("#microsoft.graph.cloudPcReports");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CloudPcReports
     */
    @javax.annotation.Nonnull
    public static CloudPcReports createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcReports();
    }
    /**
     * Gets the exportJobs property value. The export jobs created for downloading reports.
     * @return a cloudPcExportJob
     */
    @javax.annotation.Nullable
    public java.util.List<CloudPcExportJob> getExportJobs() {
        return this._exportJobs;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CloudPcReports currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("exportJobs", (n) -> { currentObject.setExportJobs(n.getCollectionOfObjectValues(CloudPcExportJob::createFromDiscriminatorValue)); });
        return deserializerMap
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
        writer.writeCollectionOfObjectValues("exportJobs", this.getExportJobs());
    }
    /**
     * Sets the exportJobs property value. The export jobs created for downloading reports.
     * @param value Value to set for the exportJobs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExportJobs(@javax.annotation.Nullable final java.util.List<CloudPcExportJob> value) {
        this._exportJobs = value;
    }
}
