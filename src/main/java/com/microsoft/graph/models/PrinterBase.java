package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrinterBase extends Entity implements Parsable {
    /**
     * The capabilities property
     */
    private PrinterCapabilities capabilities;
    /**
     * The defaults property
     */
    private PrinterDefaults defaults;
    /**
     * The displayName property
     */
    private String displayName;
    /**
     * The isAcceptingJobs property
     */
    private Boolean isAcceptingJobs;
    /**
     * The jobs property
     */
    private java.util.List<PrintJob> jobs;
    /**
     * The location property
     */
    private PrinterLocation location;
    /**
     * The manufacturer property
     */
    private String manufacturer;
    /**
     * The model property
     */
    private String model;
    /**
     * The name property
     */
    private String name;
    /**
     * The status property
     */
    private PrinterStatus status;
    /**
     * Instantiates a new printerBase and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PrinterBase() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a printerBase
     */
    @javax.annotation.Nonnull
    public static PrinterBase createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.printer": return new Printer();
                case "#microsoft.graph.printerShare": return new PrinterShare();
            }
        }
        return new PrinterBase();
    }
    /**
     * Gets the capabilities property value. The capabilities property
     * @return a printerCapabilities
     */
    @javax.annotation.Nullable
    public PrinterCapabilities getCapabilities() {
        return this.capabilities;
    }
    /**
     * Gets the defaults property value. The defaults property
     * @return a printerDefaults
     */
    @javax.annotation.Nullable
    public PrinterDefaults getDefaults() {
        return this.defaults;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("capabilities", (n) -> { this.setCapabilities(n.getObjectValue(PrinterCapabilities::createFromDiscriminatorValue)); });
        deserializerMap.put("defaults", (n) -> { this.setDefaults(n.getObjectValue(PrinterDefaults::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isAcceptingJobs", (n) -> { this.setIsAcceptingJobs(n.getBooleanValue()); });
        deserializerMap.put("jobs", (n) -> { this.setJobs(n.getCollectionOfObjectValues(PrintJob::createFromDiscriminatorValue)); });
        deserializerMap.put("location", (n) -> { this.setLocation(n.getObjectValue(PrinterLocation::createFromDiscriminatorValue)); });
        deserializerMap.put("manufacturer", (n) -> { this.setManufacturer(n.getStringValue()); });
        deserializerMap.put("model", (n) -> { this.setModel(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getObjectValue(PrinterStatus::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isAcceptingJobs property value. The isAcceptingJobs property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsAcceptingJobs() {
        return this.isAcceptingJobs;
    }
    /**
     * Gets the jobs property value. The jobs property
     * @return a printJob
     */
    @javax.annotation.Nullable
    public java.util.List<PrintJob> getJobs() {
        return this.jobs;
    }
    /**
     * Gets the location property value. The location property
     * @return a printerLocation
     */
    @javax.annotation.Nullable
    public PrinterLocation getLocation() {
        return this.location;
    }
    /**
     * Gets the manufacturer property value. The manufacturer property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManufacturer() {
        return this.manufacturer;
    }
    /**
     * Gets the model property value. The model property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getModel() {
        return this.model;
    }
    /**
     * Gets the name property value. The name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the status property value. The status property
     * @return a PrinterStatus
     */
    @javax.annotation.Nullable
    public PrinterStatus getStatus() {
        return this.status;
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
        writer.writeObjectValue("capabilities", this.getCapabilities());
        writer.writeObjectValue("defaults", this.getDefaults());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isAcceptingJobs", this.getIsAcceptingJobs());
        writer.writeCollectionOfObjectValues("jobs", this.getJobs());
        writer.writeObjectValue("location", this.getLocation());
        writer.writeStringValue("manufacturer", this.getManufacturer());
        writer.writeStringValue("model", this.getModel());
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("status", this.getStatus());
    }
    /**
     * Sets the capabilities property value. The capabilities property
     * @param value Value to set for the capabilities property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCapabilities(@javax.annotation.Nullable final PrinterCapabilities value) {
        this.capabilities = value;
    }
    /**
     * Sets the defaults property value. The defaults property
     * @param value Value to set for the defaults property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaults(@javax.annotation.Nullable final PrinterDefaults value) {
        this.defaults = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the isAcceptingJobs property value. The isAcceptingJobs property
     * @param value Value to set for the isAcceptingJobs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsAcceptingJobs(@javax.annotation.Nullable final Boolean value) {
        this.isAcceptingJobs = value;
    }
    /**
     * Sets the jobs property value. The jobs property
     * @param value Value to set for the jobs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJobs(@javax.annotation.Nullable final java.util.List<PrintJob> value) {
        this.jobs = value;
    }
    /**
     * Sets the location property value. The location property
     * @param value Value to set for the location property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocation(@javax.annotation.Nullable final PrinterLocation value) {
        this.location = value;
    }
    /**
     * Sets the manufacturer property value. The manufacturer property
     * @param value Value to set for the manufacturer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManufacturer(@javax.annotation.Nullable final String value) {
        this.manufacturer = value;
    }
    /**
     * Sets the model property value. The model property
     * @param value Value to set for the model property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModel(@javax.annotation.Nullable final String value) {
        this.model = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final PrinterStatus value) {
        this.status = value;
    }
}
