package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** This will allow the admin to see the different templated organizational messages that can be created */
public class OrganizationalMessageGuidedContent extends Entity implements Parsable {
    /** Example of the logo that will be displayed to customers and its size requirements */
    private OrganizationalMessageLogoGuide _logo;
    /** Contains the different types of text content that can be displayed to customers along with their localized values */
    private java.util.List<OrganizationalMessagePlacementDetail> _placementDetails;
    /** Indicates the scenario for the message */
    private OrganizationalMessageScenario _scenario;
    /** Indicates the area where content will be displayed to customers */
    private OrganizationalMessageSurface _surface;
    /** Indicates the theme for the guided content */
    private OrganizationalMessageTheme _theme;
    /**
     * Instantiates a new organizationalMessageGuidedContent and sets the default values.
     * @return a void
     */
    public OrganizationalMessageGuidedContent() {
        super();
        this.setOdataType("#microsoft.graph.organizationalMessageGuidedContent");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a organizationalMessageGuidedContent
     */
    @javax.annotation.Nonnull
    public static OrganizationalMessageGuidedContent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationalMessageGuidedContent();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OrganizationalMessageGuidedContent currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("logo", (n) -> { currentObject.setLogo(n.getObjectValue(OrganizationalMessageLogoGuide::createFromDiscriminatorValue)); });
            this.put("placementDetails", (n) -> { currentObject.setPlacementDetails(n.getCollectionOfObjectValues(OrganizationalMessagePlacementDetail::createFromDiscriminatorValue)); });
            this.put("scenario", (n) -> { currentObject.setScenario(n.getEnumValue(OrganizationalMessageScenario.class)); });
            this.put("surface", (n) -> { currentObject.setSurface(n.getEnumValue(OrganizationalMessageSurface.class)); });
            this.put("theme", (n) -> { currentObject.setTheme(n.getEnumValue(OrganizationalMessageTheme.class)); });
        }};
    }
    /**
     * Gets the logo property value. Example of the logo that will be displayed to customers and its size requirements
     * @return a organizationalMessageLogoGuide
     */
    @javax.annotation.Nullable
    public OrganizationalMessageLogoGuide getLogo() {
        return this._logo;
    }
    /**
     * Gets the placementDetails property value. Contains the different types of text content that can be displayed to customers along with their localized values
     * @return a organizationalMessagePlacementDetail
     */
    @javax.annotation.Nullable
    public java.util.List<OrganizationalMessagePlacementDetail> getPlacementDetails() {
        return this._placementDetails;
    }
    /**
     * Gets the scenario property value. Indicates the scenario for the message
     * @return a organizationalMessageScenario
     */
    @javax.annotation.Nullable
    public OrganizationalMessageScenario getScenario() {
        return this._scenario;
    }
    /**
     * Gets the surface property value. Indicates the area where content will be displayed to customers
     * @return a organizationalMessageSurface
     */
    @javax.annotation.Nullable
    public OrganizationalMessageSurface getSurface() {
        return this._surface;
    }
    /**
     * Gets the theme property value. Indicates the theme for the guided content
     * @return a organizationalMessageTheme
     */
    @javax.annotation.Nullable
    public OrganizationalMessageTheme getTheme() {
        return this._theme;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("logo", this.getLogo());
        writer.writeCollectionOfObjectValues("placementDetails", this.getPlacementDetails());
        writer.writeEnumValue("scenario", this.getScenario());
        writer.writeEnumValue("surface", this.getSurface());
        writer.writeEnumValue("theme", this.getTheme());
    }
    /**
     * Sets the logo property value. Example of the logo that will be displayed to customers and its size requirements
     * @param value Value to set for the logo property.
     * @return a void
     */
    public void setLogo(@javax.annotation.Nullable final OrganizationalMessageLogoGuide value) {
        this._logo = value;
    }
    /**
     * Sets the placementDetails property value. Contains the different types of text content that can be displayed to customers along with their localized values
     * @param value Value to set for the placementDetails property.
     * @return a void
     */
    public void setPlacementDetails(@javax.annotation.Nullable final java.util.List<OrganizationalMessagePlacementDetail> value) {
        this._placementDetails = value;
    }
    /**
     * Sets the scenario property value. Indicates the scenario for the message
     * @param value Value to set for the scenario property.
     * @return a void
     */
    public void setScenario(@javax.annotation.Nullable final OrganizationalMessageScenario value) {
        this._scenario = value;
    }
    /**
     * Sets the surface property value. Indicates the area where content will be displayed to customers
     * @param value Value to set for the surface property.
     * @return a void
     */
    public void setSurface(@javax.annotation.Nullable final OrganizationalMessageSurface value) {
        this._surface = value;
    }
    /**
     * Sets the theme property value. Indicates the theme for the guided content
     * @param value Value to set for the theme property.
     * @return a void
     */
    public void setTheme(@javax.annotation.Nullable final OrganizationalMessageTheme value) {
        this._theme = value;
    }
}
