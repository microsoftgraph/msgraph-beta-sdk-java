package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Contains the different variants of text that can be displayed for a given placement within a surface */
public class OrganizationalMessagePlacementDetail implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The OdataType property */
    private String _odataType;
    /** Indicates the name of the placement */
    private OrganizationalMessagePlacement _placement;
    /** The list of different variants that can be displayed for this placement */
    private java.util.List<OrganizationalMessageVariant> _variants;
    /**
     * Instantiates a new organizationalMessagePlacementDetail and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OrganizationalMessagePlacementDetail() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.organizationalMessagePlacementDetail");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a organizationalMessagePlacementDetail
     */
    @javax.annotation.Nonnull
    public static OrganizationalMessagePlacementDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationalMessagePlacementDetail();
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
        final OrganizationalMessagePlacementDetail currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(3) {{
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("placement", (n) -> { currentObject.setPlacement(n.getEnumValue(OrganizationalMessagePlacement.class)); });
            this.put("variants", (n) -> { currentObject.setVariants(n.getCollectionOfObjectValues(OrganizationalMessageVariant::createFromDiscriminatorValue)); });
        }};
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
     * Gets the placement property value. Indicates the name of the placement
     * @return a organizationalMessagePlacement
     */
    @javax.annotation.Nullable
    public OrganizationalMessagePlacement getPlacement() {
        return this._placement;
    }
    /**
     * Gets the variants property value. The list of different variants that can be displayed for this placement
     * @return a organizationalMessageVariant
     */
    @javax.annotation.Nullable
    public java.util.List<OrganizationalMessageVariant> getVariants() {
        return this._variants;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("placement", this.getPlacement());
        writer.writeCollectionOfObjectValues("variants", this.getVariants());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the placement property value. Indicates the name of the placement
     * @param value Value to set for the placement property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPlacement(@javax.annotation.Nullable final OrganizationalMessagePlacement value) {
        this._placement = value;
    }
    /**
     * Sets the variants property value. The list of different variants that can be displayed for this placement
     * @param value Value to set for the variants property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVariants(@javax.annotation.Nullable final java.util.List<OrganizationalMessageVariant> value) {
        this._variants = value;
    }
}
