package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Admin implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The appsAndServices property
     */
    private AdminAppsAndServices appsAndServices;
    /**
     * The dynamics property
     */
    private AdminDynamics dynamics;
    /**
     * A container for Microsoft Edge resources. Read-only.
     */
    private Edge edge;
    /**
     * The forms property
     */
    private AdminForms forms;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * A container for administrative resources to manage reports.
     */
    private AdminReportSettings reportSettings;
    /**
     * A container for service communications resources. Read-only.
     */
    private ServiceAnnouncement serviceAnnouncement;
    /**
     * The sharepoint property
     */
    private Sharepoint sharepoint;
    /**
     * The todo property
     */
    private AdminTodo todo;
    /**
     * A container for all Windows administrator functionalities. Read-only.
     */
    private AdminWindows windows;
    /**
     * Instantiates a new Admin and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Admin() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Admin
     */
    @javax.annotation.Nonnull
    public static Admin createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Admin();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the appsAndServices property value. The appsAndServices property
     * @return a adminAppsAndServices
     */
    @javax.annotation.Nullable
    public AdminAppsAndServices getAppsAndServices() {
        return this.appsAndServices;
    }
    /**
     * Gets the dynamics property value. The dynamics property
     * @return a adminDynamics
     */
    @javax.annotation.Nullable
    public AdminDynamics getDynamics() {
        return this.dynamics;
    }
    /**
     * Gets the edge property value. A container for Microsoft Edge resources. Read-only.
     * @return a edge
     */
    @javax.annotation.Nullable
    public Edge getEdge() {
        return this.edge;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("appsAndServices", (n) -> { this.setAppsAndServices(n.getObjectValue(AdminAppsAndServices::createFromDiscriminatorValue)); });
        deserializerMap.put("dynamics", (n) -> { this.setDynamics(n.getObjectValue(AdminDynamics::createFromDiscriminatorValue)); });
        deserializerMap.put("edge", (n) -> { this.setEdge(n.getObjectValue(Edge::createFromDiscriminatorValue)); });
        deserializerMap.put("forms", (n) -> { this.setForms(n.getObjectValue(AdminForms::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("reportSettings", (n) -> { this.setReportSettings(n.getObjectValue(AdminReportSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("serviceAnnouncement", (n) -> { this.setServiceAnnouncement(n.getObjectValue(ServiceAnnouncement::createFromDiscriminatorValue)); });
        deserializerMap.put("sharepoint", (n) -> { this.setSharepoint(n.getObjectValue(Sharepoint::createFromDiscriminatorValue)); });
        deserializerMap.put("todo", (n) -> { this.setTodo(n.getObjectValue(AdminTodo::createFromDiscriminatorValue)); });
        deserializerMap.put("windows", (n) -> { this.setWindows(n.getObjectValue(AdminWindows::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the forms property value. The forms property
     * @return a adminForms
     */
    @javax.annotation.Nullable
    public AdminForms getForms() {
        return this.forms;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the reportSettings property value. A container for administrative resources to manage reports.
     * @return a adminReportSettings
     */
    @javax.annotation.Nullable
    public AdminReportSettings getReportSettings() {
        return this.reportSettings;
    }
    /**
     * Gets the serviceAnnouncement property value. A container for service communications resources. Read-only.
     * @return a serviceAnnouncement
     */
    @javax.annotation.Nullable
    public ServiceAnnouncement getServiceAnnouncement() {
        return this.serviceAnnouncement;
    }
    /**
     * Gets the sharepoint property value. The sharepoint property
     * @return a sharepoint
     */
    @javax.annotation.Nullable
    public Sharepoint getSharepoint() {
        return this.sharepoint;
    }
    /**
     * Gets the todo property value. The todo property
     * @return a adminTodo
     */
    @javax.annotation.Nullable
    public AdminTodo getTodo() {
        return this.todo;
    }
    /**
     * Gets the windows property value. A container for all Windows administrator functionalities. Read-only.
     * @return a adminWindows
     */
    @javax.annotation.Nullable
    public AdminWindows getWindows() {
        return this.windows;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("appsAndServices", this.getAppsAndServices());
        writer.writeObjectValue("dynamics", this.getDynamics());
        writer.writeObjectValue("edge", this.getEdge());
        writer.writeObjectValue("forms", this.getForms());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("reportSettings", this.getReportSettings());
        writer.writeObjectValue("serviceAnnouncement", this.getServiceAnnouncement());
        writer.writeObjectValue("sharepoint", this.getSharepoint());
        writer.writeObjectValue("todo", this.getTodo());
        writer.writeObjectValue("windows", this.getWindows());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the appsAndServices property value. The appsAndServices property
     * @param value Value to set for the appsAndServices property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppsAndServices(@javax.annotation.Nullable final AdminAppsAndServices value) {
        this.appsAndServices = value;
    }
    /**
     * Sets the dynamics property value. The dynamics property
     * @param value Value to set for the dynamics property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDynamics(@javax.annotation.Nullable final AdminDynamics value) {
        this.dynamics = value;
    }
    /**
     * Sets the edge property value. A container for Microsoft Edge resources. Read-only.
     * @param value Value to set for the edge property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdge(@javax.annotation.Nullable final Edge value) {
        this.edge = value;
    }
    /**
     * Sets the forms property value. The forms property
     * @param value Value to set for the forms property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setForms(@javax.annotation.Nullable final AdminForms value) {
        this.forms = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the reportSettings property value. A container for administrative resources to manage reports.
     * @param value Value to set for the reportSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReportSettings(@javax.annotation.Nullable final AdminReportSettings value) {
        this.reportSettings = value;
    }
    /**
     * Sets the serviceAnnouncement property value. A container for service communications resources. Read-only.
     * @param value Value to set for the serviceAnnouncement property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServiceAnnouncement(@javax.annotation.Nullable final ServiceAnnouncement value) {
        this.serviceAnnouncement = value;
    }
    /**
     * Sets the sharepoint property value. The sharepoint property
     * @param value Value to set for the sharepoint property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharepoint(@javax.annotation.Nullable final Sharepoint value) {
        this.sharepoint = value;
    }
    /**
     * Sets the todo property value. The todo property
     * @param value Value to set for the todo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTodo(@javax.annotation.Nullable final AdminTodo value) {
        this.todo = value;
    }
    /**
     * Sets the windows property value. A container for all Windows administrator functionalities. Read-only.
     * @param value Value to set for the windows property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindows(@javax.annotation.Nullable final AdminWindows value) {
        this.windows = value;
    }
}
