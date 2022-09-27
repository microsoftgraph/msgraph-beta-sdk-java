package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationIdentityMatchingOptions implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The appliesTo property */
    private EducationUserRole _appliesTo;
    /** The OdataType property */
    private String _odataType;
    /** The name of the source property, which should be a field name in the source data. This property is case-sensitive. */
    private String _sourcePropertyName;
    /** The domain to suffix with the source property to match on the target. If provided as null, the source property will be used to match with the target property. */
    private String _targetDomain;
    /** The name of the target property, which should be a valid property in Azure AD. This property is case-sensitive. */
    private String _targetPropertyName;
    /**
     * Instantiates a new educationIdentityMatchingOptions and sets the default values.
     * @return a void
     */
    public EducationIdentityMatchingOptions() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.educationIdentityMatchingOptions");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a educationIdentityMatchingOptions
     */
    @javax.annotation.Nonnull
    public static EducationIdentityMatchingOptions createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationIdentityMatchingOptions();
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
     * Gets the appliesTo property value. The appliesTo property
     * @return a educationUserRole
     */
    @javax.annotation.Nullable
    public EducationUserRole getAppliesTo() {
        return this._appliesTo;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EducationIdentityMatchingOptions currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(5) {{
            this.put("appliesTo", (n) -> { currentObject.setAppliesTo(n.getEnumValue(EducationUserRole.class)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("sourcePropertyName", (n) -> { currentObject.setSourcePropertyName(n.getStringValue()); });
            this.put("targetDomain", (n) -> { currentObject.setTargetDomain(n.getStringValue()); });
            this.put("targetPropertyName", (n) -> { currentObject.setTargetPropertyName(n.getStringValue()); });
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
     * Gets the sourcePropertyName property value. The name of the source property, which should be a field name in the source data. This property is case-sensitive.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSourcePropertyName() {
        return this._sourcePropertyName;
    }
    /**
     * Gets the targetDomain property value. The domain to suffix with the source property to match on the target. If provided as null, the source property will be used to match with the target property.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetDomain() {
        return this._targetDomain;
    }
    /**
     * Gets the targetPropertyName property value. The name of the target property, which should be a valid property in Azure AD. This property is case-sensitive.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetPropertyName() {
        return this._targetPropertyName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("appliesTo", this.getAppliesTo());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("sourcePropertyName", this.getSourcePropertyName());
        writer.writeStringValue("targetDomain", this.getTargetDomain());
        writer.writeStringValue("targetPropertyName", this.getTargetPropertyName());
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
     * Sets the appliesTo property value. The appliesTo property
     * @param value Value to set for the appliesTo property.
     * @return a void
     */
    public void setAppliesTo(@javax.annotation.Nullable final EducationUserRole value) {
        this._appliesTo = value;
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
     * Sets the sourcePropertyName property value. The name of the source property, which should be a field name in the source data. This property is case-sensitive.
     * @param value Value to set for the sourcePropertyName property.
     * @return a void
     */
    public void setSourcePropertyName(@javax.annotation.Nullable final String value) {
        this._sourcePropertyName = value;
    }
    /**
     * Sets the targetDomain property value. The domain to suffix with the source property to match on the target. If provided as null, the source property will be used to match with the target property.
     * @param value Value to set for the targetDomain property.
     * @return a void
     */
    public void setTargetDomain(@javax.annotation.Nullable final String value) {
        this._targetDomain = value;
    }
    /**
     * Sets the targetPropertyName property value. The name of the target property, which should be a valid property in Azure AD. This property is case-sensitive.
     * @param value Value to set for the targetPropertyName property.
     * @return a void
     */
    public void setTargetPropertyName(@javax.annotation.Nullable final String value) {
        this._targetPropertyName = value;
    }
}
