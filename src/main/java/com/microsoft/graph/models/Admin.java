package com.microsoft.graph.models;

import com.microsoft.graph.models.tenantadmin.Sharepoint;
import com.microsoft.graph.models.windowsupdates.Windows;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Admin implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** A container for Microsoft Edge resources. Read-only. */
    private Edge _edge;
    /** The OdataType property */
    private String _odataType;
    /** A container for administrative resources to manage reports. */
    private AdminReportSettings _reportSettings;
    /** A container for service communications resources. Read-only. */
    private ServiceAnnouncement _serviceAnnouncement;
    /** A container for administrative resources to manage tenant-level settings for SharePoint and OneDrive. */
    private Sharepoint _sharepoint;
    /** A container for all Windows Update for Business deployment service functionality. Read-only. */
    private Windows _windows;
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
        return this._additionalData;
    }
    /**
     * Gets the edge property value. A container for Microsoft Edge resources. Read-only.
     * @return a edge
     */
    @javax.annotation.Nullable
    public Edge getEdge() {
        return this._edge;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(6);
        deserializerMap.put("edge", (n) -> { this.setEdge(n.getObjectValue(Edge::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("reportSettings", (n) -> { this.setReportSettings(n.getObjectValue(AdminReportSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("serviceAnnouncement", (n) -> { this.setServiceAnnouncement(n.getObjectValue(ServiceAnnouncement::createFromDiscriminatorValue)); });
        deserializerMap.put("sharepoint", (n) -> { this.setSharepoint(n.getObjectValue(Sharepoint::createFromDiscriminatorValue)); });
        deserializerMap.put("windows", (n) -> { this.setWindows(n.getObjectValue(Windows::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the reportSettings property value. A container for administrative resources to manage reports.
     * @return a adminReportSettings
     */
    @javax.annotation.Nullable
    public AdminReportSettings getReportSettings() {
        return this._reportSettings;
    }
    /**
     * Gets the serviceAnnouncement property value. A container for service communications resources. Read-only.
     * @return a serviceAnnouncement
     */
    @javax.annotation.Nullable
    public ServiceAnnouncement getServiceAnnouncement() {
        return this._serviceAnnouncement;
    }
    /**
     * Gets the sharepoint property value. A container for administrative resources to manage tenant-level settings for SharePoint and OneDrive.
     * @return a sharepoint
     */
    @javax.annotation.Nullable
    public Sharepoint getSharepoint() {
        return this._sharepoint;
    }
    /**
     * Gets the windows property value. A container for all Windows Update for Business deployment service functionality. Read-only.
     * @return a windows
     */
    @javax.annotation.Nullable
    public Windows getWindows() {
        return this._windows;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("edge", this.getEdge());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("reportSettings", this.getReportSettings());
        writer.writeObjectValue("serviceAnnouncement", this.getServiceAnnouncement());
        writer.writeObjectValue("sharepoint", this.getSharepoint());
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
        this._additionalData = value;
    }
    /**
     * Sets the edge property value. A container for Microsoft Edge resources. Read-only.
     * @param value Value to set for the edge property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdge(@javax.annotation.Nullable final Edge value) {
        this._edge = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the reportSettings property value. A container for administrative resources to manage reports.
     * @param value Value to set for the reportSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReportSettings(@javax.annotation.Nullable final AdminReportSettings value) {
        this._reportSettings = value;
    }
    /**
     * Sets the serviceAnnouncement property value. A container for service communications resources. Read-only.
     * @param value Value to set for the serviceAnnouncement property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServiceAnnouncement(@javax.annotation.Nullable final ServiceAnnouncement value) {
        this._serviceAnnouncement = value;
    }
    /**
     * Sets the sharepoint property value. A container for administrative resources to manage tenant-level settings for SharePoint and OneDrive.
     * @param value Value to set for the sharepoint property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharepoint(@javax.annotation.Nullable final Sharepoint value) {
        this._sharepoint = value;
    }
    /**
     * Sets the windows property value. A container for all Windows Update for Business deployment service functionality. Read-only.
     * @param value Value to set for the windows property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindows(@javax.annotation.Nullable final Windows value) {
        this._windows = value;
    }
}
