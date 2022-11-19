package com.microsoft.graph.models;

import com.microsoft.graph.models.CredentialSingleSignOnExtension;
import com.microsoft.graph.models.IosAzureAdSingleSignOnExtension;
import com.microsoft.graph.models.IosCredentialSingleSignOnExtension;
import com.microsoft.graph.models.IosKerberosSingleSignOnExtension;
import com.microsoft.graph.models.IosRedirectSingleSignOnExtension;
import com.microsoft.graph.models.IosSingleSignOnExtension;
import com.microsoft.graph.models.KerberosSingleSignOnExtension;
import com.microsoft.graph.models.MacOSAzureAdSingleSignOnExtension;
import com.microsoft.graph.models.MacOSCredentialSingleSignOnExtension;
import com.microsoft.graph.models.MacOSKerberosSingleSignOnExtension;
import com.microsoft.graph.models.MacOSRedirectSingleSignOnExtension;
import com.microsoft.graph.models.MacOSSingleSignOnExtension;
import com.microsoft.graph.models.RedirectSingleSignOnExtension;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Represents an Apple Single Sign-On Extension. */
public class SingleSignOnExtension implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new singleSignOnExtension and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SingleSignOnExtension() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.singleSignOnExtension");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a singleSignOnExtension
     */
    @javax.annotation.Nonnull
    public static SingleSignOnExtension createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.credentialSingleSignOnExtension": return new CredentialSingleSignOnExtension();
                case "#microsoft.graph.iosAzureAdSingleSignOnExtension": return new IosAzureAdSingleSignOnExtension();
                case "#microsoft.graph.iosCredentialSingleSignOnExtension": return new IosCredentialSingleSignOnExtension();
                case "#microsoft.graph.iosKerberosSingleSignOnExtension": return new IosKerberosSingleSignOnExtension();
                case "#microsoft.graph.iosRedirectSingleSignOnExtension": return new IosRedirectSingleSignOnExtension();
                case "#microsoft.graph.iosSingleSignOnExtension": return new IosSingleSignOnExtension();
                case "#microsoft.graph.kerberosSingleSignOnExtension": return new KerberosSingleSignOnExtension();
                case "#microsoft.graph.macOSAzureAdSingleSignOnExtension": return new MacOSAzureAdSingleSignOnExtension();
                case "#microsoft.graph.macOSCredentialSingleSignOnExtension": return new MacOSCredentialSingleSignOnExtension();
                case "#microsoft.graph.macOSKerberosSingleSignOnExtension": return new MacOSKerberosSingleSignOnExtension();
                case "#microsoft.graph.macOSRedirectSingleSignOnExtension": return new MacOSRedirectSingleSignOnExtension();
                case "#microsoft.graph.macOSSingleSignOnExtension": return new MacOSSingleSignOnExtension();
                case "#microsoft.graph.redirectSingleSignOnExtension": return new RedirectSingleSignOnExtension();
            }
        }
        return new SingleSignOnExtension();
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
        final SingleSignOnExtension currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(1);
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
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
}
