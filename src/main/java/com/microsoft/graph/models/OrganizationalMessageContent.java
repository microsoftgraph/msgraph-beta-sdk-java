package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Contains the entire content of the message that will be displayed to the clients */
public class OrganizationalMessageContent implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The ID of the guided content that this content is using */
    private String _guidedContentId;
    /** The logo that will be displayed to the clients. This will contain ether the binary contents of the logo or a url to the logo's location */
    private OrganizationalMessageLogo _logoInfo;
    /** The OdataType property */
    private String _odataType;
    /** Contains the different types of text content that can be displayed to customers along with their localized values */
    private java.util.List<OrganizationalMessagePlacementDetail> _placementDetails;
    /**
     * Instantiates a new organizationalMessageContent and sets the default values.
     * @return a void
     */
    public OrganizationalMessageContent() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.organizationalMessageContent");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a organizationalMessageContent
     */
    @javax.annotation.Nonnull
    public static OrganizationalMessageContent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationalMessageContent();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OrganizationalMessageContent currentObject = this;
        return new HashMap<>(4) {{
            this.put("guidedContentId", (n) -> { currentObject.setGuidedContentId(n.getStringValue()); });
            this.put("logoInfo", (n) -> { currentObject.setLogoInfo(n.getObjectValue(OrganizationalMessageLogo::createFromDiscriminatorValue)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("placementDetails", (n) -> { currentObject.setPlacementDetails(n.getCollectionOfObjectValues(OrganizationalMessagePlacementDetail::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the guidedContentId property value. The ID of the guided content that this content is using
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGuidedContentId() {
        return this._guidedContentId;
    }
    /**
     * Gets the logoInfo property value. The logo that will be displayed to the clients. This will contain ether the binary contents of the logo or a url to the logo's location
     * @return a organizationalMessageLogo
     */
    @javax.annotation.Nullable
    public OrganizationalMessageLogo getLogoInfo() {
        return this._logoInfo;
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
     * Gets the placementDetails property value. Contains the different types of text content that can be displayed to customers along with their localized values
     * @return a organizationalMessagePlacementDetail
     */
    @javax.annotation.Nullable
    public java.util.List<OrganizationalMessagePlacementDetail> getPlacementDetails() {
        return this._placementDetails;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("guidedContentId", this.getGuidedContentId());
        writer.writeObjectValue("logoInfo", this.getLogoInfo());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("placementDetails", this.getPlacementDetails());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the guidedContentId property value. The ID of the guided content that this content is using
     * @param value Value to set for the guidedContentId property.
     * @return a void
     */
    public void setGuidedContentId(@javax.annotation.Nullable final String value) {
        this._guidedContentId = value;
    }
    /**
     * Sets the logoInfo property value. The logo that will be displayed to the clients. This will contain ether the binary contents of the logo or a url to the logo's location
     * @param value Value to set for the logoInfo property.
     * @return a void
     */
    public void setLogoInfo(@javax.annotation.Nullable final OrganizationalMessageLogo value) {
        this._logoInfo = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the placementDetails property value. Contains the different types of text content that can be displayed to customers along with their localized values
     * @param value Value to set for the placementDetails property.
     * @return a void
     */
    public void setPlacementDetails(@javax.annotation.Nullable final java.util.List<OrganizationalMessagePlacementDetail> value) {
        this._placementDetails = value;
    }
}
