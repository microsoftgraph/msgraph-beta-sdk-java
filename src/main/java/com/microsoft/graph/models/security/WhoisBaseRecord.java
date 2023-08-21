package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WhoisBaseRecord extends Entity implements Parsable {
    /**
     * The abuse property
     */
    private WhoisContact abuse;
    /**
     * The admin property
     */
    private WhoisContact admin;
    /**
     * The billing property
     */
    private WhoisContact billing;
    /**
     * The domainStatus property
     */
    private String domainStatus;
    /**
     * The expirationDateTime property
     */
    private OffsetDateTime expirationDateTime;
    /**
     * The firstSeenDateTime property
     */
    private OffsetDateTime firstSeenDateTime;
    /**
     * The host property
     */
    private Host host;
    /**
     * The lastSeenDateTime property
     */
    private OffsetDateTime lastSeenDateTime;
    /**
     * The lastUpdateDateTime property
     */
    private OffsetDateTime lastUpdateDateTime;
    /**
     * The nameservers property
     */
    private java.util.List<WhoisNameserver> nameservers;
    /**
     * The noc property
     */
    private WhoisContact noc;
    /**
     * The rawWhoisText property
     */
    private String rawWhoisText;
    /**
     * The registrant property
     */
    private WhoisContact registrant;
    /**
     * The registrar property
     */
    private WhoisContact registrar;
    /**
     * The registrationDateTime property
     */
    private OffsetDateTime registrationDateTime;
    /**
     * The technical property
     */
    private WhoisContact technical;
    /**
     * The whoisServer property
     */
    private String whoisServer;
    /**
     * The zone property
     */
    private WhoisContact zone;
    /**
     * Instantiates a new whoisBaseRecord and sets the default values.
     */
    public WhoisBaseRecord() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a whoisBaseRecord
     */
    @jakarta.annotation.Nonnull
    public static WhoisBaseRecord createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.security.whoisHistoryRecord": return new WhoisHistoryRecord();
                case "#microsoft.graph.security.whoisRecord": return new WhoisRecord();
            }
        }
        return new WhoisBaseRecord();
    }
    /**
     * Gets the abuse property value. The abuse property
     * @return a whoisContact
     */
    @jakarta.annotation.Nullable
    public WhoisContact getAbuse() {
        return this.abuse;
    }
    /**
     * Gets the admin property value. The admin property
     * @return a whoisContact
     */
    @jakarta.annotation.Nullable
    public WhoisContact getAdmin() {
        return this.admin;
    }
    /**
     * Gets the billing property value. The billing property
     * @return a whoisContact
     */
    @jakarta.annotation.Nullable
    public WhoisContact getBilling() {
        return this.billing;
    }
    /**
     * Gets the domainStatus property value. The domainStatus property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDomainStatus() {
        return this.domainStatus;
    }
    /**
     * Gets the expirationDateTime property value. The expirationDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("abuse", (n) -> { this.setAbuse(n.getObjectValue(WhoisContact::createFromDiscriminatorValue)); });
        deserializerMap.put("admin", (n) -> { this.setAdmin(n.getObjectValue(WhoisContact::createFromDiscriminatorValue)); });
        deserializerMap.put("billing", (n) -> { this.setBilling(n.getObjectValue(WhoisContact::createFromDiscriminatorValue)); });
        deserializerMap.put("domainStatus", (n) -> { this.setDomainStatus(n.getStringValue()); });
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("firstSeenDateTime", (n) -> { this.setFirstSeenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("host", (n) -> { this.setHost(n.getObjectValue(Host::createFromDiscriminatorValue)); });
        deserializerMap.put("lastSeenDateTime", (n) -> { this.setLastSeenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastUpdateDateTime", (n) -> { this.setLastUpdateDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("nameservers", (n) -> { this.setNameservers(n.getCollectionOfObjectValues(WhoisNameserver::createFromDiscriminatorValue)); });
        deserializerMap.put("noc", (n) -> { this.setNoc(n.getObjectValue(WhoisContact::createFromDiscriminatorValue)); });
        deserializerMap.put("rawWhoisText", (n) -> { this.setRawWhoisText(n.getStringValue()); });
        deserializerMap.put("registrant", (n) -> { this.setRegistrant(n.getObjectValue(WhoisContact::createFromDiscriminatorValue)); });
        deserializerMap.put("registrar", (n) -> { this.setRegistrar(n.getObjectValue(WhoisContact::createFromDiscriminatorValue)); });
        deserializerMap.put("registrationDateTime", (n) -> { this.setRegistrationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("technical", (n) -> { this.setTechnical(n.getObjectValue(WhoisContact::createFromDiscriminatorValue)); });
        deserializerMap.put("whoisServer", (n) -> { this.setWhoisServer(n.getStringValue()); });
        deserializerMap.put("zone", (n) -> { this.setZone(n.getObjectValue(WhoisContact::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the firstSeenDateTime property value. The firstSeenDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFirstSeenDateTime() {
        return this.firstSeenDateTime;
    }
    /**
     * Gets the host property value. The host property
     * @return a host
     */
    @jakarta.annotation.Nullable
    public Host getHost() {
        return this.host;
    }
    /**
     * Gets the lastSeenDateTime property value. The lastSeenDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSeenDateTime() {
        return this.lastSeenDateTime;
    }
    /**
     * Gets the lastUpdateDateTime property value. The lastUpdateDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastUpdateDateTime() {
        return this.lastUpdateDateTime;
    }
    /**
     * Gets the nameservers property value. The nameservers property
     * @return a whoisNameserver
     */
    @jakarta.annotation.Nullable
    public java.util.List<WhoisNameserver> getNameservers() {
        return this.nameservers;
    }
    /**
     * Gets the noc property value. The noc property
     * @return a whoisContact
     */
    @jakarta.annotation.Nullable
    public WhoisContact getNoc() {
        return this.noc;
    }
    /**
     * Gets the rawWhoisText property value. The rawWhoisText property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRawWhoisText() {
        return this.rawWhoisText;
    }
    /**
     * Gets the registrant property value. The registrant property
     * @return a whoisContact
     */
    @jakarta.annotation.Nullable
    public WhoisContact getRegistrant() {
        return this.registrant;
    }
    /**
     * Gets the registrar property value. The registrar property
     * @return a whoisContact
     */
    @jakarta.annotation.Nullable
    public WhoisContact getRegistrar() {
        return this.registrar;
    }
    /**
     * Gets the registrationDateTime property value. The registrationDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRegistrationDateTime() {
        return this.registrationDateTime;
    }
    /**
     * Gets the technical property value. The technical property
     * @return a whoisContact
     */
    @jakarta.annotation.Nullable
    public WhoisContact getTechnical() {
        return this.technical;
    }
    /**
     * Gets the whoisServer property value. The whoisServer property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getWhoisServer() {
        return this.whoisServer;
    }
    /**
     * Gets the zone property value. The zone property
     * @return a whoisContact
     */
    @jakarta.annotation.Nullable
    public WhoisContact getZone() {
        return this.zone;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("abuse", this.getAbuse());
        writer.writeObjectValue("admin", this.getAdmin());
        writer.writeObjectValue("billing", this.getBilling());
        writer.writeStringValue("domainStatus", this.getDomainStatus());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeOffsetDateTimeValue("firstSeenDateTime", this.getFirstSeenDateTime());
        writer.writeObjectValue("host", this.getHost());
        writer.writeOffsetDateTimeValue("lastSeenDateTime", this.getLastSeenDateTime());
        writer.writeOffsetDateTimeValue("lastUpdateDateTime", this.getLastUpdateDateTime());
        writer.writeCollectionOfObjectValues("nameservers", this.getNameservers());
        writer.writeObjectValue("noc", this.getNoc());
        writer.writeStringValue("rawWhoisText", this.getRawWhoisText());
        writer.writeObjectValue("registrant", this.getRegistrant());
        writer.writeObjectValue("registrar", this.getRegistrar());
        writer.writeOffsetDateTimeValue("registrationDateTime", this.getRegistrationDateTime());
        writer.writeObjectValue("technical", this.getTechnical());
        writer.writeStringValue("whoisServer", this.getWhoisServer());
        writer.writeObjectValue("zone", this.getZone());
    }
    /**
     * Sets the abuse property value. The abuse property
     * @param value Value to set for the abuse property.
     */
    public void setAbuse(@jakarta.annotation.Nullable final WhoisContact value) {
        this.abuse = value;
    }
    /**
     * Sets the admin property value. The admin property
     * @param value Value to set for the admin property.
     */
    public void setAdmin(@jakarta.annotation.Nullable final WhoisContact value) {
        this.admin = value;
    }
    /**
     * Sets the billing property value. The billing property
     * @param value Value to set for the billing property.
     */
    public void setBilling(@jakarta.annotation.Nullable final WhoisContact value) {
        this.billing = value;
    }
    /**
     * Sets the domainStatus property value. The domainStatus property
     * @param value Value to set for the domainStatus property.
     */
    public void setDomainStatus(@jakarta.annotation.Nullable final String value) {
        this.domainStatus = value;
    }
    /**
     * Sets the expirationDateTime property value. The expirationDateTime property
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.expirationDateTime = value;
    }
    /**
     * Sets the firstSeenDateTime property value. The firstSeenDateTime property
     * @param value Value to set for the firstSeenDateTime property.
     */
    public void setFirstSeenDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.firstSeenDateTime = value;
    }
    /**
     * Sets the host property value. The host property
     * @param value Value to set for the host property.
     */
    public void setHost(@jakarta.annotation.Nullable final Host value) {
        this.host = value;
    }
    /**
     * Sets the lastSeenDateTime property value. The lastSeenDateTime property
     * @param value Value to set for the lastSeenDateTime property.
     */
    public void setLastSeenDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastSeenDateTime = value;
    }
    /**
     * Sets the lastUpdateDateTime property value. The lastUpdateDateTime property
     * @param value Value to set for the lastUpdateDateTime property.
     */
    public void setLastUpdateDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastUpdateDateTime = value;
    }
    /**
     * Sets the nameservers property value. The nameservers property
     * @param value Value to set for the nameservers property.
     */
    public void setNameservers(@jakarta.annotation.Nullable final java.util.List<WhoisNameserver> value) {
        this.nameservers = value;
    }
    /**
     * Sets the noc property value. The noc property
     * @param value Value to set for the noc property.
     */
    public void setNoc(@jakarta.annotation.Nullable final WhoisContact value) {
        this.noc = value;
    }
    /**
     * Sets the rawWhoisText property value. The rawWhoisText property
     * @param value Value to set for the rawWhoisText property.
     */
    public void setRawWhoisText(@jakarta.annotation.Nullable final String value) {
        this.rawWhoisText = value;
    }
    /**
     * Sets the registrant property value. The registrant property
     * @param value Value to set for the registrant property.
     */
    public void setRegistrant(@jakarta.annotation.Nullable final WhoisContact value) {
        this.registrant = value;
    }
    /**
     * Sets the registrar property value. The registrar property
     * @param value Value to set for the registrar property.
     */
    public void setRegistrar(@jakarta.annotation.Nullable final WhoisContact value) {
        this.registrar = value;
    }
    /**
     * Sets the registrationDateTime property value. The registrationDateTime property
     * @param value Value to set for the registrationDateTime property.
     */
    public void setRegistrationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.registrationDateTime = value;
    }
    /**
     * Sets the technical property value. The technical property
     * @param value Value to set for the technical property.
     */
    public void setTechnical(@jakarta.annotation.Nullable final WhoisContact value) {
        this.technical = value;
    }
    /**
     * Sets the whoisServer property value. The whoisServer property
     * @param value Value to set for the whoisServer property.
     */
    public void setWhoisServer(@jakarta.annotation.Nullable final String value) {
        this.whoisServer = value;
    }
    /**
     * Sets the zone property value. The zone property
     * @param value Value to set for the zone property.
     */
    public void setZone(@jakarta.annotation.Nullable final WhoisContact value) {
        this.zone = value;
    }
}
