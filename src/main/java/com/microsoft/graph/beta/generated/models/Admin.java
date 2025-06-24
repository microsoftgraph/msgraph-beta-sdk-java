package com.microsoft.graph.beta.models;

import com.microsoft.graph.beta.models.teamsadministration.TeamsAdminRoot;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Admin implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link Admin} and sets the default values.
     */
    public Admin() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Admin}
     */
    @jakarta.annotation.Nonnull
    public static Admin createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Admin();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the appsAndServices property value. The appsAndServices property
     * @return a {@link AdminAppsAndServices}
     */
    @jakarta.annotation.Nullable
    public AdminAppsAndServices getAppsAndServices() {
        return this.backingStore.get("appsAndServices");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the configurationManagement property value. The configurationManagement property
     * @return a {@link ConfigurationManagement}
     */
    @jakarta.annotation.Nullable
    public ConfigurationManagement getConfigurationManagement() {
        return this.backingStore.get("configurationManagement");
    }
    /**
     * Gets the dynamics property value. The dynamics property
     * @return a {@link AdminDynamics}
     */
    @jakarta.annotation.Nullable
    public AdminDynamics getDynamics() {
        return this.backingStore.get("dynamics");
    }
    /**
     * Gets the edge property value. A container for Microsoft Edge resources. Read-only.
     * @return a {@link Edge}
     */
    @jakarta.annotation.Nullable
    public Edge getEdge() {
        return this.backingStore.get("edge");
    }
    /**
     * Gets the entra property value. A container for Microsoft Entra resources. Read-only.
     * @return a {@link Entra}
     */
    @jakarta.annotation.Nullable
    public Entra getEntra() {
        return this.backingStore.get("entra");
    }
    /**
     * Gets the exchange property value. A container for the Exchange admin functionality. Read-only.
     * @return a {@link ExchangeAdmin}
     */
    @jakarta.annotation.Nullable
    public ExchangeAdmin getExchange() {
        return this.backingStore.get("exchange");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(16);
        deserializerMap.put("appsAndServices", (n) -> { this.setAppsAndServices(n.getObjectValue(AdminAppsAndServices::createFromDiscriminatorValue)); });
        deserializerMap.put("configurationManagement", (n) -> { this.setConfigurationManagement(n.getObjectValue(ConfigurationManagement::createFromDiscriminatorValue)); });
        deserializerMap.put("dynamics", (n) -> { this.setDynamics(n.getObjectValue(AdminDynamics::createFromDiscriminatorValue)); });
        deserializerMap.put("edge", (n) -> { this.setEdge(n.getObjectValue(Edge::createFromDiscriminatorValue)); });
        deserializerMap.put("entra", (n) -> { this.setEntra(n.getObjectValue(Entra::createFromDiscriminatorValue)); });
        deserializerMap.put("exchange", (n) -> { this.setExchange(n.getObjectValue(ExchangeAdmin::createFromDiscriminatorValue)); });
        deserializerMap.put("forms", (n) -> { this.setForms(n.getObjectValue(AdminForms::createFromDiscriminatorValue)); });
        deserializerMap.put("microsoft365Apps", (n) -> { this.setMicrosoft365Apps(n.getObjectValue(AdminMicrosoft365Apps::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("people", (n) -> { this.setPeople(n.getObjectValue(PeopleAdminSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("reportSettings", (n) -> { this.setReportSettings(n.getObjectValue(AdminReportSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("serviceAnnouncement", (n) -> { this.setServiceAnnouncement(n.getObjectValue(ServiceAnnouncement::createFromDiscriminatorValue)); });
        deserializerMap.put("sharepoint", (n) -> { this.setSharepoint(n.getObjectValue(Sharepoint::createFromDiscriminatorValue)); });
        deserializerMap.put("teams", (n) -> { this.setTeams(n.getObjectValue(TeamsAdminRoot::createFromDiscriminatorValue)); });
        deserializerMap.put("todo", (n) -> { this.setTodo(n.getObjectValue(AdminTodo::createFromDiscriminatorValue)); });
        deserializerMap.put("windows", (n) -> { this.setWindows(n.getObjectValue(AdminWindows::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the forms property value. The forms property
     * @return a {@link AdminForms}
     */
    @jakarta.annotation.Nullable
    public AdminForms getForms() {
        return this.backingStore.get("forms");
    }
    /**
     * Gets the microsoft365Apps property value. A container for the Microsoft 365 apps admin functionality.
     * @return a {@link AdminMicrosoft365Apps}
     */
    @jakarta.annotation.Nullable
    public AdminMicrosoft365Apps getMicrosoft365Apps() {
        return this.backingStore.get("microsoft365Apps");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the people property value. Represents a setting to control people-related admin settings in the tenant.
     * @return a {@link PeopleAdminSettings}
     */
    @jakarta.annotation.Nullable
    public PeopleAdminSettings getPeople() {
        return this.backingStore.get("people");
    }
    /**
     * Gets the reportSettings property value. A container for administrative resources to manage reports.
     * @return a {@link AdminReportSettings}
     */
    @jakarta.annotation.Nullable
    public AdminReportSettings getReportSettings() {
        return this.backingStore.get("reportSettings");
    }
    /**
     * Gets the serviceAnnouncement property value. A container for service communications resources. Read-only.
     * @return a {@link ServiceAnnouncement}
     */
    @jakarta.annotation.Nullable
    public ServiceAnnouncement getServiceAnnouncement() {
        return this.backingStore.get("serviceAnnouncement");
    }
    /**
     * Gets the sharepoint property value. The sharepoint property
     * @return a {@link Sharepoint}
     */
    @jakarta.annotation.Nullable
    public Sharepoint getSharepoint() {
        return this.backingStore.get("sharepoint");
    }
    /**
     * Gets the teams property value. Represents a collection of user configurations.
     * @return a {@link TeamsAdminRoot}
     */
    @jakarta.annotation.Nullable
    public TeamsAdminRoot getTeams() {
        return this.backingStore.get("teams");
    }
    /**
     * Gets the todo property value. The todo property
     * @return a {@link AdminTodo}
     */
    @jakarta.annotation.Nullable
    public AdminTodo getTodo() {
        return this.backingStore.get("todo");
    }
    /**
     * Gets the windows property value. A container for all Windows administrator functionalities. Read-only.
     * @return a {@link AdminWindows}
     */
    @jakarta.annotation.Nullable
    public AdminWindows getWindows() {
        return this.backingStore.get("windows");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("appsAndServices", this.getAppsAndServices());
        writer.writeObjectValue("configurationManagement", this.getConfigurationManagement());
        writer.writeObjectValue("dynamics", this.getDynamics());
        writer.writeObjectValue("edge", this.getEdge());
        writer.writeObjectValue("entra", this.getEntra());
        writer.writeObjectValue("exchange", this.getExchange());
        writer.writeObjectValue("forms", this.getForms());
        writer.writeObjectValue("microsoft365Apps", this.getMicrosoft365Apps());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("people", this.getPeople());
        writer.writeObjectValue("reportSettings", this.getReportSettings());
        writer.writeObjectValue("serviceAnnouncement", this.getServiceAnnouncement());
        writer.writeObjectValue("sharepoint", this.getSharepoint());
        writer.writeObjectValue("teams", this.getTeams());
        writer.writeObjectValue("todo", this.getTodo());
        writer.writeObjectValue("windows", this.getWindows());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the appsAndServices property value. The appsAndServices property
     * @param value Value to set for the appsAndServices property.
     */
    public void setAppsAndServices(@jakarta.annotation.Nullable final AdminAppsAndServices value) {
        this.backingStore.set("appsAndServices", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the configurationManagement property value. The configurationManagement property
     * @param value Value to set for the configurationManagement property.
     */
    public void setConfigurationManagement(@jakarta.annotation.Nullable final ConfigurationManagement value) {
        this.backingStore.set("configurationManagement", value);
    }
    /**
     * Sets the dynamics property value. The dynamics property
     * @param value Value to set for the dynamics property.
     */
    public void setDynamics(@jakarta.annotation.Nullable final AdminDynamics value) {
        this.backingStore.set("dynamics", value);
    }
    /**
     * Sets the edge property value. A container for Microsoft Edge resources. Read-only.
     * @param value Value to set for the edge property.
     */
    public void setEdge(@jakarta.annotation.Nullable final Edge value) {
        this.backingStore.set("edge", value);
    }
    /**
     * Sets the entra property value. A container for Microsoft Entra resources. Read-only.
     * @param value Value to set for the entra property.
     */
    public void setEntra(@jakarta.annotation.Nullable final Entra value) {
        this.backingStore.set("entra", value);
    }
    /**
     * Sets the exchange property value. A container for the Exchange admin functionality. Read-only.
     * @param value Value to set for the exchange property.
     */
    public void setExchange(@jakarta.annotation.Nullable final ExchangeAdmin value) {
        this.backingStore.set("exchange", value);
    }
    /**
     * Sets the forms property value. The forms property
     * @param value Value to set for the forms property.
     */
    public void setForms(@jakarta.annotation.Nullable final AdminForms value) {
        this.backingStore.set("forms", value);
    }
    /**
     * Sets the microsoft365Apps property value. A container for the Microsoft 365 apps admin functionality.
     * @param value Value to set for the microsoft365Apps property.
     */
    public void setMicrosoft365Apps(@jakarta.annotation.Nullable final AdminMicrosoft365Apps value) {
        this.backingStore.set("microsoft365Apps", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the people property value. Represents a setting to control people-related admin settings in the tenant.
     * @param value Value to set for the people property.
     */
    public void setPeople(@jakarta.annotation.Nullable final PeopleAdminSettings value) {
        this.backingStore.set("people", value);
    }
    /**
     * Sets the reportSettings property value. A container for administrative resources to manage reports.
     * @param value Value to set for the reportSettings property.
     */
    public void setReportSettings(@jakarta.annotation.Nullable final AdminReportSettings value) {
        this.backingStore.set("reportSettings", value);
    }
    /**
     * Sets the serviceAnnouncement property value. A container for service communications resources. Read-only.
     * @param value Value to set for the serviceAnnouncement property.
     */
    public void setServiceAnnouncement(@jakarta.annotation.Nullable final ServiceAnnouncement value) {
        this.backingStore.set("serviceAnnouncement", value);
    }
    /**
     * Sets the sharepoint property value. The sharepoint property
     * @param value Value to set for the sharepoint property.
     */
    public void setSharepoint(@jakarta.annotation.Nullable final Sharepoint value) {
        this.backingStore.set("sharepoint", value);
    }
    /**
     * Sets the teams property value. Represents a collection of user configurations.
     * @param value Value to set for the teams property.
     */
    public void setTeams(@jakarta.annotation.Nullable final TeamsAdminRoot value) {
        this.backingStore.set("teams", value);
    }
    /**
     * Sets the todo property value. The todo property
     * @param value Value to set for the todo property.
     */
    public void setTodo(@jakarta.annotation.Nullable final AdminTodo value) {
        this.backingStore.set("todo", value);
    }
    /**
     * Sets the windows property value. A container for all Windows administrator functionalities. Read-only.
     * @param value Value to set for the windows property.
     */
    public void setWindows(@jakarta.annotation.Nullable final AdminWindows value) {
        this.backingStore.set("windows", value);
    }
}
