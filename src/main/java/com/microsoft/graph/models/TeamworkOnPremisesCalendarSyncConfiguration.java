package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamworkOnPremisesCalendarSyncConfiguration implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The fully qualified domain name (FQDN) of the Skype for Business Server. Use the Exchange domain if the Skype for Business SIP domain is different from the Exchange domain of the user. */
    private String _domain;
    /** The domain and username of the console device, for example, Seattle/RanierConf. */
    private String _domainUserName;
    /** The OdataType property */
    private String _odataType;
    /** The Simple Mail Transfer Protocol (SMTP) address of the user account. This is only required if a different user principal name (UPN) is used to sign in to Exchange other than Microsoft Teams and Skype for Business. This is a common scenario in a hybrid environment where an on-premises Exchange server is used. */
    private String _smtpAddress;
    /**
     * Instantiates a new teamworkOnPremisesCalendarSyncConfiguration and sets the default values.
     * @return a void
     */
    public TeamworkOnPremisesCalendarSyncConfiguration() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.teamworkOnPremisesCalendarSyncConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkOnPremisesCalendarSyncConfiguration
     */
    @javax.annotation.Nonnull
    public static TeamworkOnPremisesCalendarSyncConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkOnPremisesCalendarSyncConfiguration();
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
     * Gets the domain property value. The fully qualified domain name (FQDN) of the Skype for Business Server. Use the Exchange domain if the Skype for Business SIP domain is different from the Exchange domain of the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDomain() {
        return this._domain;
    }
    /**
     * Gets the domainUserName property value. The domain and username of the console device, for example, Seattle/RanierConf.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDomainUserName() {
        return this._domainUserName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeamworkOnPremisesCalendarSyncConfiguration currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(4) {{
            this.put("domain", (n) -> { currentObject.setDomain(n.getStringValue()); });
            this.put("domainUserName", (n) -> { currentObject.setDomainUserName(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("smtpAddress", (n) -> { currentObject.setSmtpAddress(n.getStringValue()); });
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
     * Gets the smtpAddress property value. The Simple Mail Transfer Protocol (SMTP) address of the user account. This is only required if a different user principal name (UPN) is used to sign in to Exchange other than Microsoft Teams and Skype for Business. This is a common scenario in a hybrid environment where an on-premises Exchange server is used.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSmtpAddress() {
        return this._smtpAddress;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("domain", this.getDomain());
        writer.writeStringValue("domainUserName", this.getDomainUserName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("smtpAddress", this.getSmtpAddress());
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
     * Sets the domain property value. The fully qualified domain name (FQDN) of the Skype for Business Server. Use the Exchange domain if the Skype for Business SIP domain is different from the Exchange domain of the user.
     * @param value Value to set for the domain property.
     * @return a void
     */
    public void setDomain(@javax.annotation.Nullable final String value) {
        this._domain = value;
    }
    /**
     * Sets the domainUserName property value. The domain and username of the console device, for example, Seattle/RanierConf.
     * @param value Value to set for the domainUserName property.
     * @return a void
     */
    public void setDomainUserName(@javax.annotation.Nullable final String value) {
        this._domainUserName = value;
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
     * Sets the smtpAddress property value. The Simple Mail Transfer Protocol (SMTP) address of the user account. This is only required if a different user principal name (UPN) is used to sign in to Exchange other than Microsoft Teams and Skype for Business. This is a common scenario in a hybrid environment where an on-premises Exchange server is used.
     * @param value Value to set for the smtpAddress property.
     * @return a void
     */
    public void setSmtpAddress(@javax.annotation.Nullable final String value) {
        this._smtpAddress = value;
    }
}
