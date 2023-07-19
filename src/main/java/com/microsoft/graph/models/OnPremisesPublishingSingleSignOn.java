package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OnPremisesPublishingSingleSignOn implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The Kerberos Constrained Delegation settings for applications that use Integrated Window Authentication.
     */
    private KerberosSignOnSettings kerberosSignOnSettings;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The preferred single-sign on mode for the application. Possible values are: none, onPremisesKerberos, aadHeaderBased,pingHeaderBased, oAuthToken.
     */
    private SingleSignOnMode singleSignOnMode;
    /**
     * Instantiates a new onPremisesPublishingSingleSignOn and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OnPremisesPublishingSingleSignOn() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a onPremisesPublishingSingleSignOn
     */
    @javax.annotation.Nonnull
    public static OnPremisesPublishingSingleSignOn createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnPremisesPublishingSingleSignOn();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("kerberosSignOnSettings", (n) -> { this.setKerberosSignOnSettings(n.getObjectValue(KerberosSignOnSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("singleSignOnMode", (n) -> { this.setSingleSignOnMode(n.getEnumValue(SingleSignOnMode.class)); });
        return deserializerMap;
    }
    /**
     * Gets the kerberosSignOnSettings property value. The Kerberos Constrained Delegation settings for applications that use Integrated Window Authentication.
     * @return a kerberosSignOnSettings
     */
    @javax.annotation.Nullable
    public KerberosSignOnSettings getKerberosSignOnSettings() {
        return this.kerberosSignOnSettings;
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
     * Gets the singleSignOnMode property value. The preferred single-sign on mode for the application. Possible values are: none, onPremisesKerberos, aadHeaderBased,pingHeaderBased, oAuthToken.
     * @return a singleSignOnMode
     */
    @javax.annotation.Nullable
    public SingleSignOnMode getSingleSignOnMode() {
        return this.singleSignOnMode;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("kerberosSignOnSettings", this.getKerberosSignOnSettings());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("singleSignOnMode", this.getSingleSignOnMode());
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
     * Sets the kerberosSignOnSettings property value. The Kerberos Constrained Delegation settings for applications that use Integrated Window Authentication.
     * @param value Value to set for the kerberosSignOnSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKerberosSignOnSettings(@javax.annotation.Nullable final KerberosSignOnSettings value) {
        this.kerberosSignOnSettings = value;
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
     * Sets the singleSignOnMode property value. The preferred single-sign on mode for the application. Possible values are: none, onPremisesKerberos, aadHeaderBased,pingHeaderBased, oAuthToken.
     * @param value Value to set for the singleSignOnMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSingleSignOnMode(@javax.annotation.Nullable final SingleSignOnMode value) {
        this.singleSignOnMode = value;
    }
}
